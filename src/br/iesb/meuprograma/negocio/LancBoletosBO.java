
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.LancBoletos;
import java.util.ArrayList;
import java.util.List;

public class LancBoletosBO implements BO<LancBoletos>{

public void validar( LancBoletos entidade) throws NegocioException {
        
        if(entidade.getCliente()== 0){
            
         throw new NegocioException ("Campo Cliente obrigatório");   
        }
        if(entidade.getData()== 0){
            
         throw new NegocioException ("Campo Data obrigatório");   
        }
        if(entidade.getVencimento()== 0){
            
         throw new NegocioException ("Campo Vencimento obrigatório");   
        }
        if(entidade.getValor()== 0){
            
         throw new NegocioException ("Campo Valor obrigatório");   
        }
        
        
       
    }

  
    public void inserir( LancBoletos entidade) throws NegocioException {
        
            validar(entidade);
    }

  
    public void alterar( LancBoletos entidade) throws NegocioException {
        validar(entidade);
        consultar (entidade.getId());
    }

    public void excluir(LancBoletos entidade) throws NegocioException {
       consultar (entidade.getId());
    }

  
    public  LancBoletos consultar(int id) throws NegocioException {
        return new  LancBoletos();
    }

 
    public List< LancBoletos> listar() throws NegocioException {
        return new ArrayList< LancBoletos>();
    }
    
    
}
