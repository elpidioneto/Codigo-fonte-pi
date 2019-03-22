

package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Unidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UnidadeDAO implements DAO<Unidade> {

    @Override
    public void inserir(Unidade entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql ="INSERT INTO UNIDADE (unidade, bloco, areaComum, areaPrivativa, vaga1, vaga2, vaga3 ) VALUES(?,?,?,?,?,?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setInt(1,entidade.getUnidade());
comando.setString(2,entidade.getBloco());
comando.setDouble(3,entidade.getAreaComum());
comando.setDouble(4,entidade.getAreaPrivativa());
comando.setString(5,entidade.getVaga1());
comando.setString(6,entidade.getVaga2());
comando.setString(7,entidade.getVaga3());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao incluir a Unidade. Motivo" + ex.getMessage());}
    }

    @Override
    public void alterar(Unidade entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE UNIDADE SET unidade =?, bloco=?, areaComum=?, areaPrivativa=?, vaga1=?, vaga2=?, vaga3=? WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setInt(1,entidade.getUnidade());
comando.setString(2,entidade.getBloco());
comando.setDouble(3,entidade.getAreaComum());
comando.setDouble(4,entidade.getAreaPrivativa());
comando.setString(5,entidade.getVaga1());
comando.setString(6,entidade.getVaga2());
comando.setString(7,entidade.getVaga3());
comando.setInt(8,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar a Unidade. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(Unidade entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM UNIDADE WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir a Unidade. Motivo" + ex.getMessage());}
    }

    @Override
    public Unidade consultar(int id) throws DadosException {
        Unidade unidade = new Unidade();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM UNIDADE WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 unidade.setId(resultado.getInt(1));
 unidade.setUnidade(resultado.getInt(2));
 unidade.setBloco(resultado.getString(3));
 unidade.setAreaComum(resultado.getInt(4));
 unidade.setAreaPrivativa(resultado.getInt(5)); 
 unidade.setVaga1(resultado.getString(6));
 unidade.setVaga2(resultado.getString(7));
 unidade.setVaga3(resultado.getString(8));

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar a Unidade. Motivo" + ex.getMessage());}
    return unidade;
    }

    @Override
    public List<Unidade> listar() throws DadosException {
    List<Unidade> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM UNIDADE";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while(resultado.next()){
    Unidade unidade = new Unidade();
 unidade.setId(resultado.getInt(1));
 unidade.setUnidade(resultado.getInt(2));
 unidade.setBloco(resultado.getString(3));
 unidade.setAreaComum(resultado.getInt(4));
 unidade.setAreaPrivativa(resultado.getInt(5)); 
 unidade.setVaga1(resultado.getString(6));
 unidade.setVaga2(resultado.getString(7));
 unidade.setVaga3(resultado.getString(8));
 lista.add(unidade);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar a Unidade. Motivo" + ex.getMessage());}
    return lista;   
    }
 
}

