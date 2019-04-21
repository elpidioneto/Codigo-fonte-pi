
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Conta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ContaDAO implements DAO<Conta> {

    @Override
    public void inserir(Conta entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO CONTA (conta, titulo) VALUES(?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getConta());
comando.setString(2,entidade.getTitulo());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir a conta. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void alterar(Conta entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE CONTA SET conta =?, Titulo=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getConta());
comando.setString(2,entidade.getTitulo());
comando.setInt(3,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar a Conta. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(Conta entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM CONTA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir a Conta. Motivo" + ex.getMessage());}
    }

    @Override
    public Conta consultar(int id) throws DadosException {
        Conta conta = new Conta();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM CONTA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 conta.setId(resultado.getInt(1));
 conta.setConta(resultado.getString(2));
 conta.setTitulo(resultado.getString(3));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao Consultar a Conta. Motivo" + ex.getMessage());}
    return conta;
    }

    @Override
    public List<Conta> listar() throws DadosException {
    List<Conta> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM CONTA";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while (resultado.next()){
    Conta conta = new Conta();
 conta.setId(resultado.getInt(1));
 conta.setConta(resultado.getString(2));
 conta.setTitulo(resultado.getString(3));
 lista.add(conta);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar a Conta. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}


