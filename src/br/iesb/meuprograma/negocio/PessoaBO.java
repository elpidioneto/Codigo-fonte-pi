package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.PessoaDAO;
import br.iesb.meuprograma.entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class PessoaBO implements BO<Pessoa> {

    @Override
    public void validar(Pessoa entidade) throws NegocioException {
        if (entidade.getNome().isEmpty()) {
            throw new NegocioException("Campo Nome é Obrigatório!");
        }
        if (entidade.getRg().trim().length() < 9) {
            throw new NegocioException("Campo RG é Obrigatório!");
        }
        if (entidade.getCpf().trim().length() < 14) {
            throw new NegocioException("Campo CPF é Obrigatório!");
        }
        if (entidade.getDataNascimento().trim().length() < 10) {
            throw new NegocioException("Campo Data de Nascimento é Obrigatório!");
        }
        if (entidade.getEndereco().isEmpty()) {
            throw new NegocioException("Campo Endereço é Obrigatório!");
        }
        if (entidade.getEmail().isEmpty()) {
            throw new NegocioException("Campo E-mail é Obrigatório!");
        }
        if (entidade.getTelefone().trim().length() < 13) {
            throw new NegocioException("Campo Telefone é Obrigatório!");
        }
        if (entidade.getGenero() == null) {
            throw new NegocioException("Campo Genero é Obrigatório!");
        }
        if (entidade.getMorador().equals("***")) {
            throw new NegocioException("Selecione se é morador!");
        }
        if (entidade.getTipo().equals("Selecione o Tipo")) {
            throw new NegocioException("Selecione o tipo de morador!");
        }
        if (entidade.getUnidade() == 0) {
            throw new NegocioException("Selecione a unidade");
        }
        if (entidade.getBloco().isEmpty()) {
            throw new NegocioException("Selecione o bloco");
        }

    }

    @Override
    public void inserir(Pessoa entidade) throws NegocioException {
        validar(entidade);
        PessoaDAO dao = new PessoaDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("", ex);
        }
    }

    @Override
    public void alterar(Pessoa entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getId());
        PessoaDAO dao = new PessoaDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao alterar "+ex.getMessage(), ex);
        }
    }

    @Override
    public void excluir(Pessoa entidade) throws NegocioException {
        consultar(entidade.getId());
        PessoaDAO dao = new PessoaDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("", ex);
        }
    }

    @Override
    public Pessoa consultar(int id) throws NegocioException {
        Pessoa pessoa = new Pessoa();
        PessoaDAO dao = new PessoaDAO();
        try {
            pessoa = dao.consultar(id);
            if (pessoa.getId() == 0) {
                throw new NegocioException("Pessoa não encontrada");
            }
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao consultar "+ ex.getMessage(), ex);
        }
        return pessoa;
    }

    @Override
    public List<Pessoa> listar() throws NegocioException {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        PessoaDAO dao = new PessoaDAO();
        try {
            lista = dao.listar();
            if (lista.isEmpty()) {
                throw new NegocioException("Nenhuma Pessoa encontrada");
            }
        } catch (DadosException ex) {
            throw new NegocioException(ex.getMessage(), ex);
        }
        return lista;
    }
    public List<Pessoa> listarPorNome(String nome) throws NegocioException {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        PessoaDAO dao = new PessoaDAO();
        try {
            lista = dao.listarPorNome(nome);
            if (lista.isEmpty()) {
                throw new NegocioException("Nenhuma Pessoa encontrada");
            }
        } catch (DadosException ex) {
            throw new NegocioException(ex.getMessage(), ex);
        }
        return lista;
    }
    public List<Pessoa> listarPorCpf(String cpf) throws NegocioException {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        PessoaDAO dao = new PessoaDAO();
        try {
            lista = dao.listarPorCpf(cpf);
            if (lista.isEmpty()) {
                throw new NegocioException("Nenhuma Pessoa encontrada");
            }
        } catch (DadosException ex) {
            throw new NegocioException(ex.getMessage(), ex);
        }
        return lista;
    }

}
