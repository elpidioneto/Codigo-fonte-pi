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
        Connection conexao = ConexaoBD.getConexao();
        String sql = "INSERT INTO VISITANTE (dataHoraEntrada, tipoVisita, Nome, RG, CPF, bloco,unidade) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, entidade.getDataHoraEntrada());
            comando.setString(2, entidade.getTipoVisita());
            comando.setString(3, entidade.getNome());
            comando.setString(4, entidade.getRg());
            comando.setString(5, entidade.getCpf());
            comando.setString(6, entidade.getBloco());
            comando.setInt(7, entidade.getUnidade());
            comando.executeUpdate();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao inserir Visitante. Motivo: " + ex.getMessage());
        }
    }

    @Override
    public void alterar(Visitante entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        String sql = "UPDATE VISITANTE SET DATAHORASAIDA=?) WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, entidade.getDataHoraSaida());

            comando.executeUpdate();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao alterar Visitante. Motivo: " + ex.getMessage());
        }
    }

    @Override
    public void excluir(Visitante entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        String sql = "DELETE FROM VISITANTE WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, entidade.getId());
            comando.executeUpdate();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Excluir Visitante. Motivo: " + ex.getMessage());
        }
    }

    @Override
    public Visitante consultar(int id) throws DadosException {
        Visitante visitante = new Visitante();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM PESSOA WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery(sql);
            if (resultado.next()) {
                visitante.setId(resultado.getInt(1));
                visitante.setDataHoraEntrada(resultado.getString(2));
                visitante.setDataHoraSaida(resultado.getString(3));
                visitante.setTipoVisita(resultado.getString(4));
                visitante.setNome(resultado.getString(5));
                visitante.setRg(resultado.getString(6));
                visitante.setCpf(resultado.getString(7));
                visitante.setBloco(resultado.getString(8));
                visitante.setUnidade(resultado.getInt(9));

            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Visitante. Morivo: " + ex.getMessage());
        }
        return visitante;
    }

    @Override
    public List<Visitante> listar() throws DadosException {
        List<Visitante> lista = new ArrayList<Visitante>();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM VISITANTE";
        try {
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            while (resultado.next()) {
                Visitante visitante = new Visitante();
                visitante.setId(resultado.getInt(1));
                visitante.setDataHoraEntrada(resultado.getString(2));
                visitante.setDataHoraSaida(resultado.getString(3));
                visitante.setTipoVisita(resultado.getString(4));
                visitante.setNome(resultado.getString(5));
                visitante.setRg(resultado.getString(6));
                visitante.setCpf(resultado.getString(7));
                visitante.setBloco(resultado.getString(8));
                visitante.setUnidade(resultado.getInt(9));
                lista.add(visitante);
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Pessoa. Morivo: " + ex.getMessage());
        }
        return lista;
    }

}
