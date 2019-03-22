package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.ListaConvidadosDAO;
import br.iesb.meuprograma.entidades.ListaConvidados;
import java.util.ArrayList;
import java.util.List;

public class ListaConvidadosBO  implements BO<ListaConvidados>{
     
    @Override
    public void validar(ListaConvidados entidade) throws NegocioException {
        if (entidade.getNome() == null || entidade.getNome().trim().equals("") ) {
        throw new NegocioException("O campo Nome não pode ser vazio"); }
    }
    
@Override
    public void inserir(ListaConvidados  entidade) throws NegocioException {
        validar(entidade); 
        ListaConvidadosDAO dao = new ListaConvidadosDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void alterar(ListaConvidados  entidade) throws NegocioException {
       validar(entidade);
        ListaConvidados consultar = consultar(entidade.getId());
        ListaConvidadosDAO dao = new ListaConvidadosDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void excluir(ListaConvidados  entidade) throws NegocioException {
       ListaConvidadosDAO dao = new ListaConvidadosDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public ListaConvidados  consultar(int id) throws NegocioException {
        ListaConvidados listaConvidados = new ListaConvidados();
        ListaConvidadosDAO dao = new ListaConvidadosDAO();
        try {
           listaConvidados = dao.consultar(id);
           if (listaConvidados.getId()== 0)
            throw new NegocioException("ListaConvidados não encontrada");
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
        return listaConvidados;
    }

    @Override
    public List<ListaConvidados> listar() throws NegocioException {
     List<ListaConvidados> lista = new ArrayList<ListaConvidados>();
    ListaConvidadosDAO dao = new ListaConvidadosDAO();
try{
lista = dao.listar();
if(lista.isEmpty()) {
throw new NegocioException("Nenhuma ListaConvidados cadastrada");
}
} catch (DadosException ex) {
throw new NegocioException("",ex);
}
return lista;
    }
}