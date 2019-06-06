
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.EnderecoCorrespondencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EnderecoCorrespondenciaDAO implements DAO<EnderecoCorrespondencia> {

    @Override
    public void inserir(EnderecoCorrespondencia entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO ENDERECOCORRESPONDENCIA (endereco, bairro, cep, cidade, uf) VALUES(?,?,?,?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getEndereco());
comando.setString(2,entidade.getBairro());
comando.setString(3,entidade.getCep());
comando.setString(4,entidade.getCidade());
comando.setString(5,entidade.getUf());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir o Endereço de Correspondencia. Motivo" + ex.getMessage());}
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void alterar(EnderecoCorrespondencia entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE ENDERECOCORRESPONDENCIA SET Endereco =?, Bairro=?, Cep = ?, Cidade = ?, UF = ?  WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getEndereco());
comando.setString(2,entidade.getBairro());
comando.setString(3,entidade.getCep());
comando.setString(4,entidade.getCidade());
comando.setString(5,entidade.getUf());
comando.setInt(6,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar o Endereço de Correspondencia. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(EnderecoCorrespondencia entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM ENDERECOCORRESPONDENCIA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir o Endereço de Correspondencia. Motivo" + ex.getMessage());}
    }

    @Override
    public EnderecoCorrespondencia consultar(int id) throws DadosException {
        EnderecoCorrespondencia enderecoCorrespondencia = new EnderecoCorrespondencia();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM ENDERECOCORRESPONDENCIA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 enderecoCorrespondencia.setId(resultado.getInt(1));
 enderecoCorrespondencia.setEndereco(resultado.getString(2));
 enderecoCorrespondencia.setBairro(resultado.getString(3));
 enderecoCorrespondencia.setCep(resultado.getString(4));
 enderecoCorrespondencia.setCidade(resultado.getString(5));
 enderecoCorrespondencia.setUf(resultado.getString(6));
}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Endereço de Correspondencia. Motivo" + ex.getMessage());}
    return enderecoCorrespondencia;
    }

    @Override
    public List<EnderecoCorrespondencia> listar() throws DadosException {
    List<EnderecoCorrespondencia> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM ENDERECOCORRESPONDENCIA";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while (resultado.next()){
    EnderecoCorrespondencia enderecoCorrespondencia = new EnderecoCorrespondencia();
 enderecoCorrespondencia.setId(resultado.getInt(1));
 enderecoCorrespondencia.setEndereco(resultado.getString(2));
 enderecoCorrespondencia.setBairro(resultado.getString(3));
 enderecoCorrespondencia.setCep(resultado.getString(4));
 enderecoCorrespondencia.setCidade(resultado.getString(5));
 enderecoCorrespondencia.setUf(resultado.getString(6));
 lista.add(enderecoCorrespondencia);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar o Endereço de Correspondencia. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}


