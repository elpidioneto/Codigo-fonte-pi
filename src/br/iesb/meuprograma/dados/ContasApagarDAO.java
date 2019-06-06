/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.AdmContasApagar;
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
public class ContasApagarDAO implements DAO <AdmContasApagar> {

    @Override
    public void inserir(AdmContasApagar entidade) throws DadosException {
 
        Connection conexao= ConexaoBD.getConexao();
        
     String sql ="INSERT INTO AdmContasApagar (COMPETENCIA, VALOR, VENCIMENTO, VALORPAGO) VALUES(?,?,?,?)";
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
    public void alterar(AdmContasApagar entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
        
     String sql ="UPDATE INTO AdmContasApagar (COMPETENCIA, VALOR, VENCIMENTO, VALORPAGO) VALUES(?,?,?,?)";
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
    public void excluir(AdmContasApagar entidade) throws DadosException {
         Connection conexao= ConexaoBD.getConexao();
        
     String sql ="DELETE FROM AdmContasApagar WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getId());
    
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao excluir lançamentos. Motivo" + ex.getMessage());}
    
    }

    @Override
    public AdmContasApagar consultar(int id) throws DadosException {
      
    AdmContasApagar admContasApagar = new AdmContasApagar();

    Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM AdmContasApagar WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);
    comando.setInt(1,id);
    ResultSet resultado = comando.executeQuery();
    
    if(resultado.next()){
        admContasApagar.setId(resultado.getInt(1));
        admContasApagar.setCompetencia (resultado.getInt(6));
        admContasApagar.setValor(resultado.getInt(6));
        admContasApagar.setVencimento(resultado.getInt(10));
        admContasApagar.setValorPago(resultado.getInt(10));
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return admContasApagar;
    }

    @Override
    public List<AdmContasApagar> listar() throws DadosException {
        
        List<AdmContasApagar> lista = new ArrayList<AdmContasApagar>();
    
Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM AdmContasApagar";
    try{
    Statement comando = conexao.createStatement();
    ResultSet resultado = comando.executeQuery(sql);
   
    while(resultado.next()){
        
        AdmContasApagar admContasApagar = new AdmContasApagar();
                
        admContasApagar.setId(resultado.getInt(1));
        admContasApagar.setCompetencia (resultado.getInt(6));
        admContasApagar.setValor(resultado.getInt(6));
        admContasApagar.setVencimento(resultado.getInt(10));
        admContasApagar.setValorPago(resultado.getInt(10));
        
        lista.add(admContasApagar);
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return lista;
    }


    
}

    