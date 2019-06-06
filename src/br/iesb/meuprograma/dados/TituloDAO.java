
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Titulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TituloDAO implements DAO<Titulo> {

    @Override
    public void inserir(Titulo entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO TITULO (titulo, debitoCredito) VALUES(?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getTitulo());
comando.setString(2,entidade.getDebitoCredito());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir o Titulo. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void alterar(Titulo entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE TITULO SET Titulo =?, debitoCredito=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getTitulo());
comando.setString(2,entidade.getDebitoCredito());
comando.setInt(3,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar o Titulo. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(Titulo entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM TITULO WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir o Titulo. Motivo" + ex.getMessage());}
    }

    @Override
    public Titulo consultar(int id) throws DadosException {
        Titulo titulo = new Titulo();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM TITULO WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 titulo.setId(resultado.getInt(1));
 titulo.setTitulo(resultado.getString(2));
 titulo.setDebitoCredito(resultado.getString(3));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir o Titulo. Motivo" + ex.getMessage());}
    return titulo;
    }

    @Override
    public List<Titulo> listar() throws DadosException {
    List<Titulo> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM TITULO";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while(resultado.next()){
    Titulo titulo = new Titulo();
 titulo.setId(resultado.getInt(1));
 titulo.setTitulo(resultado.getString(2));
 titulo.setDebitoCredito(resultado.getString(3));
 lista.add(titulo);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Titulo. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}


