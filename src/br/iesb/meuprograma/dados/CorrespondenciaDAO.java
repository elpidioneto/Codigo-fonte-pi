/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;

import java.sql.Connection;
import java.util.List;

import br.iesb.meuprograma.entidades.Correspondencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CorrespondenciaDAO implements DAO<Correspondencia> {

    @Override
    public void inserir(Correspondencia entidade) throws DadosException {
         Connection conexao= ConexaoBD.getConexao();
         String sql ="INSERT INTO CORRESPONDENCIA (bloco, destinatario, transportadora, rastreamento) VALUES(?,?,?,?,?)";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getBloco());
comando.setString(2,entidade.getDestinatario());
comando.setString(3,entidade.getTransportadora());
comando.setString(4,entidade.getRastreamento());
comando.executeUpdate();
} catch(SQLException ex) {     
        throw new UnsupportedOperationException("Not supported yet.");}
    }
  
    @Override
    public void alterar(Correspondencia entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
       String sql = "UPDATE CORRESPONDENCIA SET bloco =?, destinatario =?, transportadora = ?, rastreamento = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);

comando.setString(1,entidade.getBloco());
comando.setString(2,entidade.getDestinatario());
comando.setString(3,entidade.getTransportadora());
comando.setString(4,entidade.getRastreamento());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao alterar a Correspondencia. Motivo" + ex.getMessage());}
    }

    @Override
    public void excluir(Correspondencia entidade) throws DadosException {
              Connection conexao= ConexaoBD.getConexao();
       String sql = "DELETE FROM CORRESPONDENCIA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,entidade.getId());
comando.executeUpdate();
} catch(SQLException ex) {
    throw new DadosException("Erro ao excluir a Correspondencia. Motivo" + ex.getMessage());}
    }

    @Override
    public Correspondencia consultar(int id) throws DadosException {
        Correspondencia Correspondencia = new Correspondencia();
       
            Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM CORRESPONDENCIA WHERE id = ?";
try{
PreparedStatement comando = conexao.prepareStatement(sql);
comando.setInt(1,id);
ResultSet resultado = comando.executeQuery();
if(resultado.next()){
 Correspondencia.setId(resultado.getInt(1));
 Correspondencia.setBloco(resultado.getString(2));
 Correspondencia.setDestinatario(resultado.getString(3));
 Correspondencia.setTransportadora(resultado.getString(4));
 Correspondencia.setRastreamento(resultado.getString(5));
 }
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar a Correspondencia. Motivo" + ex.getMessage());}
    return Correspondencia;
    }
    
    @Override
    public List<Correspondencia> listar() throws DadosException {
        List<Correspondencia> lista = new ArrayList<>();
      Connection conexao= ConexaoBD.getConexao();
       String sql = "SELECT * FROM ENDERECOCORRESPONDENCIA";
try{
Statement comando = conexao.createStatement();
ResultSet resultado = comando.executeQuery(sql);
while (resultado.next()){
    Correspondencia Correspondencia = new Correspondencia();
 Correspondencia.setId(resultado.getInt(1));
 Correspondencia.setBloco(resultado.getString(2));
 Correspondencia.setDestinatario(resultado.getString(3));
 Correspondencia.setTransportadora(resultado.getString(4));
 Correspondencia.setRastreamento(resultado.getString(5));
 lista.add(Correspondencia);

}
} catch(SQLException ex) {
    throw new DadosException("Erro ao consultar a Correspondencia. Motivo" + ex.getMessage());}
    return lista;   
    }
}