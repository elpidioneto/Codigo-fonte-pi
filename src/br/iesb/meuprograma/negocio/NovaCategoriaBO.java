
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.NovaCategoria;
import java.util.ArrayList;
import java.util.List;


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
    }

    @Override
    public void alterar(NovaCategoria entidade) throws NegocioException {
        
        validar(entidade);
        consultar (entidade.getId());
        
    }

    @Override
    public void excluir(NovaCategoria entidade) throws NegocioException {
        consultar (entidade.getId());
    }

    @Override
    public NovaCategoria consultar(int id) throws NegocioException {
        return new NovaCategoria();
    }

    @Override
    public List<NovaCategoria> listar() throws NegocioException {
        return new ArrayList<NovaCategoria>();
    }
    
    
    
    
    
    
    
}
