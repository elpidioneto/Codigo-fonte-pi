
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.AdmContasApagar;
import java.util.ArrayList;
import java.util.List;


public class ContasApagarBO implements BO<AdmContasApagar>{

    @Override
    public void validar(AdmContasApagar entidade) throws NegocioException {
        
        if(entidade.getCompetencia()== 0){
            
         throw new NegocioException ("Campo Competência obrigatório");   
        }
        if(entidade.getValor()== 0){
            
         throw new NegocioException ("Campo Valor obrigatório");   
        }
        if(entidade.getVencimento()== 0){
            
         throw new NegocioException ("Campo Vencimento obrigatório");   
        }
        if(entidade.getValorPago()== 0){
            
         throw new NegocioException ("Campo Valor pago obrigatório");   
        }
        
        
       
    }

    @Override
    public void inserir(AdmContasApagar entidade) throws NegocioException {
        
            validar(entidade);
    }

    @Override
    public void alterar(AdmContasApagar entidade) throws NegocioException {
        validar(entidade);
        consultar (entidade.getId());
    }

    @Override
    public void excluir(AdmContasApagar entidade) throws NegocioException {
       consultar (entidade.getId());
    }

    @Override
    public AdmContasApagar consultar(int id) throws NegocioException {
        return new AdmContasApagar();
    }

    @Override
    public List<AdmContasApagar> listar() throws NegocioException {
        return new ArrayList<AdmContasApagar>();
    }
    
    
    
    
    
    
    
}
