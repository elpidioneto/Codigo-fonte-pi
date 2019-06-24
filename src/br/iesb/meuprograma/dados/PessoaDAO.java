/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.dados;

import br.iesb.meuprograma.entidades.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import br.iesb.meuprograma.dados.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lany
 */
public class PessoaDAO implements DAO<Pessoa> {

    @Override
    public void inserir(Pessoa entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        String sql = "INSERT INTO PESSOA (NOME, RG, CPF, DATANASCIMENTO,GENERO,"
                + " ENDERECO, EMAIL, TELEFONE, CELULAR, BLOCO, UNIDADE,"
                + " DATACADASTRO,MORADOR, TIPO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, entidade.getNome());
            comando.setString(2, entidade.getRg());
            comando.setString(3, entidade.getCpf());
            comando.setString(4, entidade.getDataNascimento());
            comando.setString(5, entidade.getGenero());
            comando.setString(6, entidade.getEndereco());
            comando.setString(7, entidade.getEmail());
            comando.setString(8, entidade.getTelefone());
            comando.setString(9, entidade.getCelular());
            comando.setString(10, entidade.getBloco());
            comando.setInt(11, entidade.getUnidade());
            comando.setString(12, entidade.getDataCadastro());
            comando.setString(13, entidade.getMorador());
            comando.setString(14, entidade.getTipo());
            comando.executeUpdate();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao inserir Pessoa. Motivo: " + ex.getMessage());
        }
    }

    @Override
    public void alterar(Pessoa entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        String sql = "UPDATE PESSOA SET NOME=?, RG=?, CPF=?, DATANASCIMENTO=?,GENERO=?,"
                + " ENDERECO=?, EMAIL=?, TELEFONE=?, CELULAR=?, BLOCO=?, UNIDADE=?,"
                + " DATACADASTRO=?,MORADOR=?, TIPO=? WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, entidade.getNome());
            comando.setString(2, entidade.getRg());
            comando.setString(3, entidade.getCpf());
            comando.setString(4, entidade.getDataNascimento());
            comando.setString(5, entidade.getGenero());
            comando.setString(6, entidade.getEndereco());
            comando.setString(7, entidade.getEmail());
            comando.setString(8, entidade.getTelefone());
            comando.setString(9, entidade.getCelular());
            comando.setString(10, entidade.getBloco());
            comando.setInt(11, entidade.getUnidade());
            comando.setString(12, entidade.getDataCadastro());
            comando.setString(13, entidade.getMorador());
            comando.setString(14, entidade.getTipo());
            comando.setInt(15, entidade.getId());
            comando.executeUpdate();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao alterar Pessoa. Morivo: " + ex.getMessage());
        }
    }

    @Override
    public void excluir(Pessoa entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        String sql = "DELETE FROM PESSOA WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, entidade.getId());
            comando.executeUpdate();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Excluir Pessoa. Morivo: " + ex.getMessage());
        }
    }

    @Override
    public Pessoa consultar(int id) throws DadosException {
        Pessoa pessoa = new Pessoa();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM PESSOA WHERE ID=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()) {
                pessoa.setNome(resultado.getString(1));
                pessoa.setRg(resultado.getString(2));
                pessoa.setCpf(resultado.getString(3));
                pessoa.setDataNascimento(resultado.getString(4));
                pessoa.setGenero(resultado.getString(5));
                pessoa.setEndereco(resultado.getString(6));
                pessoa.setEmail(resultado.getString(7));
                pessoa.setTelefone(resultado.getString(8));
                pessoa.setCelular(resultado.getString(9));
                pessoa.setId(resultado.getInt(10));
                pessoa.setBloco(resultado.getString(11));
                pessoa.setUnidade(resultado.getInt(12));
                pessoa.setDataCadastro(resultado.getString(13));
                pessoa.setMorador(resultado.getString(14));
                pessoa.setTipo(resultado.getString(15));

            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Pessoa. Motivo: " + ex.getMessage());
        }
        return pessoa;
    }

    @Override
    public List<Pessoa> listar() throws DadosException {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM PESSOA";
        try {
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            while (resultado.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(resultado.getString(1));
                pessoa.setRg(resultado.getString(2));
                pessoa.setCpf(resultado.getString(3));
                pessoa.setDataNascimento(resultado.getString(4));
                pessoa.setGenero(resultado.getString(5));
                pessoa.setEndereco(resultado.getString(6));
                pessoa.setEmail(resultado.getString(7));
                pessoa.setTelefone(resultado.getString(8));
                pessoa.setCelular(resultado.getString(9));
                pessoa.setId(resultado.getInt(10));
                pessoa.setBloco(resultado.getString(11));
                pessoa.setUnidade(resultado.getInt(12));
                pessoa.setDataCadastro(resultado.getString(13));
                pessoa.setMorador(resultado.getString(14));
                pessoa.setTipo(resultado.getString(15));
                lista.add(pessoa);
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Pessoa. Morivo: " + ex.getMessage());
        }
        return lista;
    }

    public List<Pessoa> listarPorNome(String nome) throws DadosException {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM PESSOA WHERE NOME LIKE ?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, "%"+nome+"%");
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()) {
                pessoa.setNome(resultado.getString(1));
                pessoa.setRg(resultado.getString(2));
                pessoa.setCpf(resultado.getString(3));
                pessoa.setDataNascimento(resultado.getString(4));
                pessoa.setGenero(resultado.getString(5));
                pessoa.setEndereco(resultado.getString(6));
                pessoa.setEmail(resultado.getString(7));
                pessoa.setTelefone(resultado.getString(8));
                pessoa.setCelular(resultado.getString(9));
                pessoa.setId(resultado.getInt(10));
                pessoa.setBloco(resultado.getString(11));
                pessoa.setUnidade(resultado.getInt(12));
                pessoa.setDataCadastro(resultado.getString(13));
                pessoa.setMorador(resultado.getString(14));
                pessoa.setTipo(resultado.getString(15));
                lista.add(pessoa);
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Pessoa. Morivo: " + ex.getMessage());
        }
        return lista;
    }
    public List<Pessoa> listarPorCpf(String cpf) throws DadosException {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM PESSOA WHERE CPF=?";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, cpf);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()) {
                pessoa.setNome(resultado.getString(1));
                pessoa.setRg(resultado.getString(2));
                pessoa.setCpf(resultado.getString(3));
                pessoa.setDataNascimento(resultado.getString(4));
                pessoa.setGenero(resultado.getString(5));
                pessoa.setEndereco(resultado.getString(6));
                pessoa.setEmail(resultado.getString(7));
                pessoa.setTelefone(resultado.getString(8));
                pessoa.setCelular(resultado.getString(9));
                pessoa.setId(resultado.getInt(10));
                pessoa.setBloco(resultado.getString(11));
                pessoa.setUnidade(resultado.getInt(12));
                pessoa.setDataCadastro(resultado.getString(13));
                pessoa.setMorador(resultado.getString(14));
                pessoa.setTipo(resultado.getString(15));
                lista.add(pessoa);
            }
        } catch (SQLException ex) {
            throw new DadosException("Erro ao Consultar Pessoa. Morivo: " + ex.getMessage());
        }
        return lista;
    }

}
