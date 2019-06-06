/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;



import br.iesb.meuprograma.entidades.NovaCategoria;
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
public class NovaCategoriaDAO implements DAO <NovaCategoria> {

    @Override
    public void inserir(NovaCategoria entidade) throws DadosException {
 
        Connection conexao= ConexaoBD.getConexao();
        
     String sql ="INSERT INTO NovaCategoria (CATEGORIA) VALUES(?)";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setString(1,entidade.getCategoria());
  
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao incluir lançamentos. Motivo" + ex.getMessage());}
    }

    @Override
    public void alterar(NovaCategoria entidade) throws DadosException {
       Connection conexao= ConexaoBD.getConexao();
        
     String sql ="UPDATE INTO NovaCategoria (CATEGORIA) VALUES(?)";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setString(1,entidade.getCategoria());
  
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao incluir lançamentos. Motivo" + ex.getMessage());}
    
    }

    @Override
    public void excluir(NovaCategoria entidade) throws DadosException {
          Connection conexao= ConexaoBD.getConexao();
        
     String sql ="DELETE FROM NovaCategoria WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);

    comando.setInt(1,entidade.getId());
    comando.executeUpdate();
    } catch(SQLException ex) {
    throw new DadosException("Erro ao excluir lançamentos. Motivo" + ex.getMessage());}
    
    }

    public NovaCategoria consultar(int id) throws DadosException {
      
    NovaCategoria novaCategoria = new NovaCategoria();

    Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM NovaCategoria WHERE ID = ?";
    try{
    PreparedStatement comando = conexao.prepareStatement(sql);
    comando.setInt(1,id);
    ResultSet resultado = comando.executeQuery();
    
    if(resultado.next()){
        novaCategoria.setId(resultado.getInt(1));
        novaCategoria.setCategoria (resultado.getString(6));
       
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return novaCategoria;
    }

    @Override
    public List<NovaCategoria> listar() throws DadosException {
        
        List<NovaCategoria> lista = new ArrayList<NovaCategoria>();
    
Connection conexao= ConexaoBD.getConexao();
        
     String sql ="SELECT FROM NovaCategoria";
    try{
    Statement comando = conexao.createStatement();
    ResultSet resultado = comando.executeQuery(sql);
   
    while(resultado.next()){
        
        NovaCategoria novaCategoria = new NovaCategoria();
                
        novaCategoria.setId(resultado.getInt(1));
        novaCategoria.setCategoria (resultado.getString(10));
      
        
        lista.add(novaCategoria);
    }
    
    } catch(SQLException ex) {
    throw new DadosException("Erro ao consultar lançamentos. Motivo" + ex.getMessage());}
     
    return lista;
    }


    
}

    