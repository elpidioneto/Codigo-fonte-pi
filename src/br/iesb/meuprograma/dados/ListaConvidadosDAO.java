
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.ListaConvidados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ListaConvidadosDAO implements DAO<ListaConvidados> {

    @Override
    public void inserir(ListaConvidados entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO LISTACONVIDADOS (idEvento, nome) VALUES(?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setInt(1,entidade.getIdEvento());
comando.setString(2,entidade.getNome());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir o Convidado. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void alterar(ListaConvidados entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE LISTACONVIDADOS SET idEvento =?, nome=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setInt(1,entidade.getIdEvento());
comando.setString(2,entidade.getNome());
comando.setInt(3,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar o Convidado. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(ListaConvidados entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM LISTACONVIDADOS WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir o Convidado. Motivo" + ex.getMessage());}
    }

    @Override
    public ListaConvidados consultar(int id) throws DadosException {
        ListaConvidados listaConvidados = new ListaConvidados();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM LISTACONVIDADOS WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 listaConvidados.setId(resultado.getInt(1));
 listaConvidados.setIdEvento(resultado.getInt(2));
 listaConvidados.setNome(resultado.getString(3));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Convidado. Motivo" + ex.getMessage());}
    return listaConvidados;
    }

    @Override
    public List<ListaConvidados> listar() throws DadosException {
    List<ListaConvidados> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM LISTACONVIDADOS";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while (resultado.next()){
    ListaConvidados listaConvidados = new ListaConvidados();
 listaConvidados.setId(resultado.getInt(1));
 listaConvidados.setIdEvento(resultado.getInt(2));
 listaConvidados.setNome(resultado.getString(3));
 lista.add(listaConvidados);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar a Titulo. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}


