/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.LancBoletos;
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
public class LancBoletosDAO implements DAO <LancBoletos> {

    @Override
    public void inserir(LancBoletos entidade) throws DadosException {
 
        Connection conexao= ConexaoBD.getConexao();
        
     String sql ="INSERT INTO LancBoletos (CLIENTE, DATA, VENCIMENTO, VALOR) VALUES(?,?,?,?)";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getCliente());
    comando.setInt(1,entidade.getData());
    comando.setInt(1,entidade.getVencimento());
    comando.setInt(1,entidade.getValor());
  
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao incluir lançamentos. Motivo" + ex.getMessage());}
    }

    @Override
    public void alterar(LancBoletos entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
        
     String sql ="UPDATE INTO LancBoletos (CLIENTE, DATA, VENCIMENTO, VALOR) VALUES(?,?,?,?)";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getCliente());
    comando.setInt(1,entidade.getData());
    comando.setInt(1,entidade.getVencimento());
    comando.setInt(1,entidade.getValor());
  
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao incluir lançamentos. Motivo" + ex.getMessage());}
    
    }

    @Override
    public void excluir(LancBoletos entidade) throws DadosException {
          Connection conexao= ConexaoBD.getConexao();
        
     String sql ="DELETE FROM LancBoletos WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getId());
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao excluir lançamentos. Motivo" + ex.getMessage());}
    
    }

    public LancBoletos consultar(int id) throws DadosException {
      
    LancBoletos lancBoletos = new LancBoletos();

    Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM LancBoletos WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);
    comando.setInt(1,id);
    ResultSet resultado = comando.executeQuery();
    
    if(resultado.next()){
        
        lancBoletos.setId(resultado.getInt(1));
        lancBoletos.setCliente (resultado.getString(10));
        lancBoletos.setData (resultado.getString(10));
        lancBoletos.setVencimento (resultado.getString(10));
        lancBoletos.setValor (resultado.getString(6));
       
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return lancBoletos;
    }

    @Override
    public List<LancBoletos> listar() throws DadosException {
        
        List<LancBoletos> lista = new ArrayList<LancBoletos>();
    
    Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM LancBoletos";
    try{
    Statement comando = conexao.createStatement();
    ResultSet resultado = comando.executeQuery(sql);
   
    while(resultado.next()){
        
        LancBoletos lancBoletos = new LancBoletos();
                
        lancBoletos.setId(resultado.getInt(1));
        lancBoletos.setCliente (resultado.getString(10));
        lancBoletos.setData (resultado.getString(10));
        lancBoletos.setVencimento (resultado.getString(10));
        lancBoletos.setValor (resultado.getInt(6));
       
      
        
        lista.add(lancBoletos);
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return lista;
    }


    
}

    