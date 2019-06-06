
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class LoginDAO implements DAO<Login> {

    @Override
    public void inserir(Login entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO PESSOA (login, senha) VALUES(?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(5,entidade.getLogin());
comando.setString(6,entidade.getSenha());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir o Login. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void alterar(Login entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE PESSOA SET login =?, senha=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getLogin());
comando.setString(2,entidade.getSenha());
comando.setInt(3,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar o Login. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(Login entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM PESSOA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir a Pessoa Motivo" + ex.getMessage());}
    }

    @Override
    public Login consultar(int id) throws DadosException {
        Login login = new Login();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM PESSOA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 login.setId(resultado.getInt(1));
 login.setLogin(resultado.getString(2));
 login.setSenha(resultado.getString(3));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o login. Motivo" + ex.getMessage());}
    return login;
    }

    @Override
    public List<Login> listar() throws DadosException {
    List<Login> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM PESSOA";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while(resultado.next()){
    Login login = new Login();
 login.setId(resultado.getInt(1));
 login.setLogin(resultado.getString(2));
 login.setSenha(resultado.getString(3));
 lista.add(login);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Login. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}


