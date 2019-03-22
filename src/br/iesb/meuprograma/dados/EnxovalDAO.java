
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Enxoval;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EnxovalDAO implements DAO<Enxoval> {

    @Override
    public void inserir(Enxoval entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO ENXOVAL (espacoId, nome, valor, quantidade) VALUES(?,?,?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setInt(1,entidade.getEspacoId());
comando.setString(2,entidade.getNome());
comando.setDouble(3,entidade.getValor());
comando.setInt(4,entidade.getQuantidade());

comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir o Enxoval. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void alterar(Enxoval entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE ENXOVAL SET espacoId =?, nome=?, valor=?, quantidade=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setInt(1,entidade.getEspacoId());
comando.setString(2,entidade.getNome());
comando.setDouble(3,entidade.getValor());
comando.setInt(4,entidade.getQuantidade());
comando.setInt(5,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar o Enxoval. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(Enxoval entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM ENXOVAL WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir o Titulo. Motivo" + ex.getMessage());}
    }

    @Override
    public Enxoval consultar(int id) throws DadosException {
        Enxoval enxoval = new Enxoval();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM ENXOVAL WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 enxoval.setId(resultado.getInt(1));
 enxoval.setEspacoId(resultado.getInt(2));
 enxoval.setNome(resultado.getString(3));
 enxoval.setValor(resultado.getDouble(4));
 enxoval.setQuantidade(resultado.getInt(5));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Enxoval. Motivo" + ex.getMessage());}
    return enxoval;
    }

    @Override
    public List<Enxoval> listar() throws DadosException {
    List<Enxoval> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM ENXOVAL";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while (resultado.next()){
   Enxoval enxoval = new Enxoval();
 enxoval.setId(resultado.getInt(1));
 enxoval.setEspacoId(resultado.getInt(2));
 enxoval.setNome(resultado.getString(3));
 enxoval.setValor(resultado.getDouble(4));
 enxoval.setQuantidade(resultado.getInt(5));
 lista.add(enxoval);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Enxoval. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}


