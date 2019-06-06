package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.ReservaEspaco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ReservaEspacoDAO implements DAO<ReservaEspaco> {

    @Override
    public void inserir(ReservaEspaco entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "INSERT INTO RESERVAESPACO (espaco, dataReserva, unidade, bloco) VALUES(?,?,?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getEspaco());
comando.setString(2,entidade.getDataReserva());
comando.setString(3,entidade.getUnidade());
comando.setString(4,entidade.getBloco());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir a Reserva. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
   
    public void alterar(ReservaEspaco entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE RESERVAESPACO SET Espaco =?, dataReserva=?, Unidade=?, Bloco=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getEspaco());
comando.setString(2,entidade.getDataReserva());
comando.setString(3,entidade.getUnidade());
comando.setString(4,entidade.getBloco());
comando.setInt(5,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar a Reserva. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(ReservaEspaco entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM RESERVAESPACO WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir a Reserva. Motivo" + ex.getMessage());}
    }

    @Override
    public ReservaEspaco consultar(int id) throws DadosException {
        ReservaEspaco reservaEspaco = new ReservaEspaco();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM RESERVAESPACO WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 reservaEspaco.setId(resultado.getInt(1));
 reservaEspaco.setEspaco(resultado.getString(2));
 reservaEspaco.setDataReserva(resultado.getString(3));
 reservaEspaco.setUnidade(resultado.getString(4));
 reservaEspaco.setBloco(resultado.getString(5));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir a Reserva. Motivo" + ex.getMessage());}
    return reservaEspaco;
    }

    @Override
    public List<ReservaEspaco> listar() throws DadosException {
    List<ReservaEspaco> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM RESERVAESPACO";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while(resultado.next()){
    ReservaEspaco reservaEspaco = new ReservaEspaco();
 reservaEspaco.setId(resultado.getInt(1));
 reservaEspaco.setEspaco(resultado.getString(2));
 reservaEspaco.setDataReserva(resultado.getString(3));
 reservaEspaco.setUnidade(resultado.getString(4));
 reservaEspaco.setBloco(resultado.getString(5));
 lista.add(reservaEspaco);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar a Reserva. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}
