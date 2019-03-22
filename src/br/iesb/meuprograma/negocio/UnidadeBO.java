package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.UnidadeDAO;
import br.iesb.meuprograma.entidades.Unidade;

import java.util.ArrayList;
import java.util.List;

public class UnidadeBO implements BO<Unidade>

{ 
    @Override
    public void validar(Unidade entidade) throws NegocioException {
        
        if (entidade.getBloco() == null || entidade.getBloco().trim().equals("") ) {
        throw new NegocioException("O Campo Bloco não pode ser Zero"); }
        
        if (entidade.getUnidade() == 0) {
        throw new NegocioException("O Campo Apartamento não pode ser Zero"); }
                        
        if (entidade.getAreaComum() == 0) {
        throw new NegocioException("O Campo Area Comum não pode ser Zero"); }
        
        if (entidade.getAreaPrivativa() == 0) {
        throw new NegocioException("O Campo Area Privativa não pode ser Zero"); }
    }

    @Override
    public void inserir(Unidade  entidade) throws NegocioException {
        validar(entidade); 
        UnidadeDAO dao = new UnidadeDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void alterar(Unidade  entidade) throws NegocioException {
       validar(entidade);
        Unidade consultar = consultar(entidade.getId());
        UnidadeDAO dao = new UnidadeDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void excluir(Unidade  entidade) throws NegocioException {
       UnidadeDAO dao = new UnidadeDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public Unidade  consultar(int id) throws NegocioException {
        Unidade unidade = new Unidade();
        UnidadeDAO dao = new UnidadeDAO();
        try {
           unidade = dao.consultar(id);
           if (unidade.getId()== 0)
            throw new NegocioException("Unidade não encontrada");
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
        return unidade;
    }

    @Override
    public List<Unidade> listar() throws NegocioException {
     List<Unidade> lista = new ArrayList<Unidade>();
    UnidadeDAO dao = new UnidadeDAO();
try{
lista = dao.listar();
if(lista.isEmpty()) {
throw new NegocioException("Nenhuma Unidade cadastrada");
}
} catch (DadosException ex) {
throw new NegocioException("",ex);
}
return lista;
    }
}