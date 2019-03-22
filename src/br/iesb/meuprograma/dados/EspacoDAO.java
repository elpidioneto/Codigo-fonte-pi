
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Espaco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EspacoDAO implements DAO<Espaco> {

    @Override
    public void inserir(Espaco entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO ESPACO (nome, horaMin, horaMax, qtdHoras, qtdReserva, qtdConvidados, valorReserva) VALUES(?,?,?,?,?,?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getNome());
comando.setInt(2,entidade.getHoraMin());
comando.setInt(3,entidade.getHoraMax());
comando.setInt(4,entidade.getQtdHoras());
comando.setInt(5,entidade.getQtdReserva());
comando.setInt(6,entidade.getQtdConvidados());
comando.setDouble(7,entidade.getValorReserva());
comando.executeUpdate();
} catch(SQLException ex) {
   throw new DadosException("Erro ao incluir o Espaço. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void alterar(Espaco entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE ESPACO SET nome=?, horaMin=?, horaMax=?, qtdHoras=?, qtdReserva=?, qtdConvidados=?, valorReserva=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getNome());
comando.setInt(2,entidade.getHoraMin());
comando.setInt(3,entidade.getHoraMax());
comando.setInt(4,entidade.getQtdHoras());
comando.setInt(5,entidade.getQtdReserva());
comando.setInt(6,entidade.getQtdConvidados());
comando.setDouble(7,entidade.getValorReserva());
comando.setInt(8,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar o Espaço. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(Espaco entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM ESPACO WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir o Espaço. Motivo" + ex.getMessage());}
    }

    @Override
    public Espaco consultar(int id) throws DadosException {
        Espaco espaco = new Espaco();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM ESPACO WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 espaco.setId(resultado.getInt(1));
 espaco.setNome(resultado.getString(2));
  espaco.setHoraMin(resultado.getInt(3));
   espaco.setHoraMax(resultado.getInt(4));
    espaco.setQtdHoras(resultado.getInt(5));
   espaco.setQtdReserva(resultado.getInt(6));
   espaco.setQtdConvidados(resultado.getInt(7));
    espaco.setValorReserva(resultado.getDouble(8));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Espaço. Motivo" + ex.getMessage());}
    return espaco;
    }

    @Override
    public List<Espaco> listar() throws DadosException {
    List<Espaco> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM ESPACO";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while (resultado.next()){
    Espaco espaco = new Espaco();
 espaco.setId(resultado.getInt(1));
 espaco.setNome(resultado.getString(2));
  espaco.setHoraMin(resultado.getInt(3));
   espaco.setHoraMax(resultado.getInt(4));
    espaco.setQtdHoras(resultado.getInt(5));
   espaco.setQtdReserva(resultado.getInt(6));
   espaco.setQtdConvidados(resultado.getInt(7));
    espaco.setValorReserva(resultado.getDouble(8));
 lista.add(espaco);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Espaço. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}


