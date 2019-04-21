package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.EnxovalDAO;
import br.iesb.meuprograma.entidades.Enxoval;
import java.util.ArrayList;
import java.util.List;

public class EnxovalBO implements BO<Enxoval> 
{
        @Override
    public void validar(Enxoval entidade) throws NegocioException {
       
        if (entidade.getNome() == null || entidade.getNome().trim().equals("") ) {
        throw new NegocioException("O campo Nome do Espaço não pode ser vazio"); }
        
        if (entidade.getValor() == 0) {
        throw new NegocioException("O campo Valor do Item não pode ser Zero"); }
        
        if (entidade.getQuantidade() == 0) {
        throw new NegocioException("O campo Quantidade do do Item não pode ser Zero");}
    }

   @Override
    public void inserir(Enxoval  entidade) throws NegocioException {
        validar(entidade); 
            EnxovalDAO dao = new EnxovalDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void alterar(Enxoval  entidade) throws NegocioException {
       validar(entidade);
        Enxoval consultar = consultar(entidade.getId()); 
          EnxovalDAO dao = new EnxovalDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void excluir(Enxoval  entidade) throws NegocioException {
       EnxovalDAO dao = new EnxovalDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public Enxoval  consultar(int id) throws NegocioException {
       Enxoval enxoval = new Enxoval();
        EnxovalDAO dao = new EnxovalDAO();
        try {
           enxoval = dao.consultar(id);
           if (enxoval.getId()== 0)
            throw new NegocioException("Enxoval não encontrada");
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
        return enxoval;
    }

    @Override
    public List<Enxoval> listar() throws NegocioException {
         List<Enxoval> lista = new ArrayList<Enxoval>();
    EnxovalDAO dao = new EnxovalDAO();
try{
lista = dao.listar();
if(lista.isEmpty()) {
throw new NegocioException("Nenhuma Enxoval cadastrada");
}
} catch (DadosException ex) {
throw new NegocioException("",ex);
}
return lista;
    }
    }
