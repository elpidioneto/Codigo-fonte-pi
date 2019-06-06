package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.EmitirBoleto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import br.iesb.meuprograma.dados.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmitirBoletoDAO implements DAO<EmitirBoleto> {

    @Override
    public void inserir(EmitirBoleto entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
       String sql = "INSERT INTO EMITIRBOLETO (COMPETENCIA, CPF) VALUES(?,?)" ;
       try{
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.setString(1, entidade.getCompetencia());
        comando.setString(2,entidade.getCpf());
        comando.executeUpdate();
       }catch(SQLException ex){
        throw new DadosException("Erro ao inserir Boleto. Motivo: " + ex.getMessage());
       }
    }

    @Override
    public void alterar(EmitirBoleto entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
       String sql = "UPDATE EMITIRBOLETO SET COMPETENCIA=?, CPF=?) WHERE ID=?";
       try{
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.setString(1, entidade.getCompetencia());
        comando.setString(2,entidade.getCpf());
        comando.executeUpdate();
       }catch(SQLException ex){
        throw new DadosException("Erro ao alterar Boleto. Morivo: " + ex.getMessage());
       }
    }

    @Override
    public void excluir(EmitirBoleto entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
       String sql = "DELETE FROM EMITIRBOLETO WHERE ID=?";
       try{
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.setInt(1, entidade.getId());
        comando.executeUpdate();
       }catch(SQLException ex){
        throw new DadosException("Erro ao Excluir EmitirBoleto. Morivo: " + ex.getMessage());
       }
    }

    @Override
    public EmitirBoleto consultar(int id) throws DadosException {
        EmitirBoleto emitirBoleto= new EmitirBoleto();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM EMITIRBOLETO WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
        emitirBoleto.setCompetencia(resultado.getString(1));
        emitirBoleto.setCpf(resultado.getString(2));
        
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar EmitirBoleto. Morivo: " + ex.getMessage());
        }
        return emitirBoleto;
    }

    @Override
    public List<EmitirBoleto> listar() throws DadosException {
        List<EmitirBoleto> lista= new ArrayList<EmitirBoleto>();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM EMITIRBOLETO";
        try {
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()){
        EmitirBoleto emitirBoleto = new EmitirBoleto();
        emitirBoleto.setCompetencia(resultado.getString(1));
        emitirBoleto.setCpf(resultado.getString(2));
        lista.add(emitirBoleto);
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Pessoa. Morivo: " + ex.getMessage());
        }
        return lista;
    }
    
}
