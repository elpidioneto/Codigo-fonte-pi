
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.NovaCategoriaDAO;
import br.iesb.meuprograma.entidades.NovaCategoria;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NovaCategoriaBO implements BO<NovaCategoria>{

    @Override
    public void validar(NovaCategoria entidade) throws NegocioException {
       if(entidade.getCategoria().isEmpty()){
           throw new NegocioException ("Campo Categoria obrigatório");
       }
    }

    @Override
    public void inserir(NovaCategoria entidade) throws NegocioException {
        
            validar(entidade);
            
            NovaCategoriaDAO dao = new NovaCategoriaDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
            
    }

    @Override
    public void alterar(NovaCategoria entidade) throws NegocioException {
        validar(entidade);
        consultar (entidade.getId());
        
         NovaCategoriaDAO dao = new NovaCategoriaDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        } 
        
    }

    @Override
    public void excluir(NovaCategoria entidade) throws NegocioException {
       consultar (entidade.getId());
       
        NovaCategoriaDAO dao = new NovaCategoriaDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
    }

    @Override
    public NovaCategoria consultar(int id) throws NegocioException {
 
        NovaCategoria novaCategoria = new NovaCategoria();
        
         NovaCategoriaDAO dao = new NovaCategoriaDAO();
        try {
         novaCategoria = dao.consultar(id);
         if (novaCategoria.getId()==0){
             throw new NegocioException ("Lançamento não encontrado");
         }   
         } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
         return novaCategoria;
    }

    @Override
    public List<NovaCategoria> listar() throws NegocioException {
        List<NovaCategoria> lista = new ArrayList<NovaCategoria>();
        NovaCategoriaDAO dao = new NovaCategoriaDAO();
        try {
         lista = dao.listar();
         if (lista.isEmpty()){
             throw new NegocioException ("Nenhum lançamento encontrado");
         }   
         } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
        return lista;
    }
    
    
    
    
    
    
    
}
