package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Visitante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import br.iesb.meuprograma.dados.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class VisitanteDAO implements DAO<Visitante> {

    @Override
    public void inserir(Visitante entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
       String sql = "INSERT INTO VISITANTE (NOME, DATAENTRADA, HORAENTRADA,TIPOVISITA) VALUES(?,?,?,?)" ;
       try{
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.setString(1, entidade.getNome());
        comando.setString(2, entidade.getDataEntrada());
        comando.setString(3,entidade.getHoraEntrada());
        comando.setString(4,entidade.getTipoVisita());        
        comando.executeUpdate();
       }catch(SQLException ex){
        throw new DadosException("Erro ao inserir Visitante. Motivo: " + ex.getMessage());
       }
    }

    @Override
    public void alterar(Visitante entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
       String sql = "UPDATE VISITANTE SET NOME=?, TIPOVISITA=?, DATAENTRADA=?, HORAENTRADA=?) WHERE ID=?";
       try{
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.setString(1, entidade.getNome());
        comando.setString(2,entidade.getTipoVisita());
        comando.setString(3,entidade.getDataEntrada());
        comando.setString(4,entidade.getHoraEntrada());
        comando.executeUpdate();
       }catch(SQLException ex){
        throw new DadosException("Erro ao alterar Visitante. Morivo: " + ex.getMessage());
       }
    }

    @Override
    public void excluir(Visitante entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
       String sql = "DELETE FROM VISITANTE WHERE ID=?";
       try{
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.setInt(1, entidade.getId());
        comando.executeUpdate();
       }catch(SQLException ex){
        throw new DadosException("Erro ao Excluir Visitante. Morivo: " + ex.getMessage());
       }
    }

    @Override
    public Visitante consultar(int id) throws DadosException {
        Visitante visitante= new Visitante();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM PESSOA WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
        visitante.setNome(resultado.getString(1));
        visitante.setTipoVisita(resultado.getString(2));
        visitante.setDataEntrada(resultado.getString(3));
        visitante.setHoraEntrada(resultado.getString(4));
        
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Visitante. Morivo: " + ex.getMessage());
        }
        return visitante;
    }

    @Override
    public List<Visitante> listar() throws DadosException {
        List<Visitante> lista= new ArrayList<Visitante>();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM VISITANTE";
        try {
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()){
        Visitante visitante = new Visitante();
        visitante.setId(resultado.getInt(1));
        visitante.setNome(resultado.getString(2));
        visitante.setDataEntrada(resultado.getString(3));
        visitante.setHoraEntrada(resultado.getString(4));
        visitante.setTipoVisita(resultado.getString(5));
        lista.add(visitante);
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Pessoa. Morivo: " + ex.getMessage());
        }
        return lista;
    }
    
}
