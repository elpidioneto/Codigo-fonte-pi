/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;



import br.iesb.meuprograma.entidades.AdmContasAreceber;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carolina
 */
public class ContasAreceberDAO implements DAO <AdmContasAreceber> {

    @Override
    public void inserir(AdmContasAreceber entidade) throws DadosException {
 
        Connection conexao= ConexaoBD.getConexao();
        
     String sql ="INSERT INTO AdmContasAreceber (COMPETENCIA, VALOR, VENCIMENTO, VALORPAGO ) VALUES(?,?,?,?,?,?,?,?)";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getCompetencia());
    comando.setFloat(2,entidade.getValor());
    comando.setInt(3,entidade.getVencimento()); 
    comando.setFloat(4,entidade.getValorPago());
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao incluir lançamentos. Motivo" + ex.getMessage());}
    }

    @Override
    public void alterar(AdmContasAreceber entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
        
     String sql ="UPDATE INTO AdmContasApagar (COMPETENCIA, VALOR, VENCIMENTO, VALORPAGO) VALUES(?,?,?,?,?,?,?,?)";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getCompetencia());
    comando.setDouble(2,entidade.getValor());
    comando.setInt(3,entidade.getVencimento()); 
    comando.setDouble(4,entidade.getValorPago());
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao incluir lançamentos. Motivo" + ex.getMessage());}
    
    }

    @Override
    public void excluir(AdmContasAreceber entidade) throws DadosException {
          Connection conexao= ConexaoBD.getConexao();
        
     String sql ="DELETE FROM AdmContasAreceber WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getId());
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao excluir lançamentos. Motivo" + ex.getMessage());}
    
    }

    public AdmContasAreceber consultar(int id) throws DadosException {
      
    AdmContasAreceber admContasAreceber = new AdmContasAreceber();

    Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM AdmContasAreceber WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);
    comando.setInt(1,id);
    ResultSet resultado = comando.executeQuery();
    
    if(resultado.next()){
        admContasAreceber.setId(resultado.getInt(1));
        admContasAreceber.setCompetencia (resultado.getInt(6));
        admContasAreceber.setValor(resultado.getInt(6));
        admContasAreceber.setVencimento(resultado.getInt(10));
        admContasAreceber.setValorPago(resultado.getInt(10));
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return admContasAreceber;
    }

    @Override
    public List<AdmContasAreceber> listar() throws DadosException {
        
        List<AdmContasAreceber> lista = new ArrayList<AdmContasAreceber>();
    
Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM AdmContasAreceber";
    try{
    Statement comando = conexao.createStatement();
    ResultSet resultado = comando.executeQuery(sql);
   
    while(resultado.next()){
        
        AdmContasAreceber admContasAreceber = new AdmContasAreceber();
                
        admContasAreceber.setId(resultado.getInt(1));
        admContasAreceber.setCompetencia (resultado.getInt(6));
        admContasAreceber.setValor(resultado.getInt(6));
        admContasAreceber.setVencimento(resultado.getInt(10));
        admContasAreceber.setValorPago(resultado.getInt(10));
        
        lista.add(admContasAreceber);
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return lista;
    }


    
}

    