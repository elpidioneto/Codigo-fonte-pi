
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.ContaDAO;
import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.entidades.Conta;
import java.util.ArrayList;
import java.util.List;

public class ContaBO  implements BO<Conta>{
      
    @Override
    public void validar(Conta entidade) throws NegocioException {
        if (entidade.getConta() == null || entidade.getConta().trim().equals("") ) {
        throw new NegocioException("O campo Conta não pode ser vazio"); }
    }
@Override
    public void inserir(Conta  entidade) throws NegocioException {
        validar(entidade); 
        ContaDAO dao = new ContaDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void alterar(Conta  entidade) throws NegocioException {
       validar(entidade);
        Conta consultar = consultar(entidade.getId());
        ContaDAO dao = new ContaDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void excluir(Conta  entidade) throws NegocioException {
       ContaDAO dao = new ContaDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public Conta  consultar(int id) throws NegocioException {
        Conta conta = new Conta();
        ContaDAO dao = new ContaDAO();
        try {
           conta = dao.consultar(id);
           if (conta.getId()== 0)
            throw new NegocioException("Conta não encontrada");
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
        return conta;
    }

    @Override
    public List<Conta> listar() throws NegocioException {
     List<Conta> lista = new ArrayList<Conta>();
    ContaDAO dao = new ContaDAO();
try{
lista = dao.listar();
if(lista.isEmpty()) {
throw new NegocioException("Nenhuma Conta cadastrada");
}
} catch (DadosException ex) {
throw new NegocioException("",ex);
}
return lista;
    }
}
