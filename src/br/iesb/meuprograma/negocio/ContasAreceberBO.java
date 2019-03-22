
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.AdmContasAreceber;
import java.util.ArrayList;
import java.util.List;


public class ContasAreceberBO implements BO<AdmContasAreceber> {

    @Override
    public void validar(AdmContasAreceber entidade) throws NegocioException {
        
        
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
    public void inserir(AdmContasAreceber entidade) throws NegocioException {
        validar(entidade);
    }

    @Override
    public void alterar(AdmContasAreceber entidade) throws NegocioException {
        validar(entidade);
        consultar (entidade.getId());
    }

    @Override
    public void excluir(AdmContasAreceber entidade) throws NegocioException {
        consultar (entidade.getId());
    }

    @Override
    public AdmContasAreceber consultar(int id) throws NegocioException {
   
      return new AdmContasAreceber();
    
    }

    @Override
    public List<AdmContasAreceber> listar() throws NegocioException {
        return new ArrayList<AdmContasAreceber>();
    }
    
    
    
    
    
    
}
