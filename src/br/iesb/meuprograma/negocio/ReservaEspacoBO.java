package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.ReservaEspacoDAO;
import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.entidades.ReservaEspaco;
import java.util.ArrayList;
import java.util.List;

public class ReservaEspacoBO  implements BO<ReservaEspaco>{
      
    @Override
    public void validar(ReservaEspaco entidade) throws NegocioException {
        if (entidade.getEspaco() == null || entidade.getEspaco().trim().equals("") ) {
        throw new NegocioException("O campo Espaco não pode ser vazio"); }
    }
@Override
    public void inserir(ReservaEspaco  entidade) throws NegocioException {
        validar(entidade); 
        ReservaEspacoDAO dao = new ReservaEspacoDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void alterar(ReservaEspaco  entidade) throws NegocioException {
       validar(entidade);
        ReservaEspaco consultar = consultar(entidade.getId());
        ReservaEspacoDAO dao = new ReservaEspacoDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void excluir(ReservaEspaco  entidade) throws NegocioException {
       ReservaEspacoDAO dao = new ReservaEspacoDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public ReservaEspaco  consultar(int id) throws NegocioException {
        ReservaEspaco conta = new ReservaEspaco();
        ReservaEspacoDAO dao = new ReservaEspacoDAO();
        try {
           conta = dao.consultar(id);
           if (conta.getId()== 0)
            throw new NegocioException("ReservaEspaco não encontrada");
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
        return conta;
    }

    @Override
    public List<ReservaEspaco> listar() throws NegocioException {
     List<ReservaEspaco> lista = new ArrayList<ReservaEspaco>();
    ReservaEspacoDAO dao = new ReservaEspacoDAO();
try{
lista = dao.listar();
if(lista.isEmpty()) {
throw new NegocioException("Nenhuma ReservaEspaco cadastrada");
}
} catch (DadosException ex) {
throw new NegocioException("",ex);
}
return lista;
    }
}
