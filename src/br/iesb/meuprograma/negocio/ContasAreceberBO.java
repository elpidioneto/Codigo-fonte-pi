
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.ContasAreceberDAO;
import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.entidades.AdmContasAreceber;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
            
            ContasAreceberDAO dao = new ContasAreceberDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
            
    }

    @Override
    public void alterar(AdmContasAreceber entidade) throws NegocioException {
        validar(entidade);
        consultar (entidade.getId());
        
         ContasAreceberDAO dao = new ContasAreceberDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        } 
        
    }

    @Override
    public void excluir(AdmContasAreceber entidade) throws NegocioException {
       consultar (entidade.getId());
       
        ContasAreceberDAO dao = new ContasAreceberDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
    }

    @Override
    public AdmContasAreceber consultar(int id) throws NegocioException {
 
        AdmContasAreceber admContasAreceber = new AdmContasAreceber();
        
         ContasAreceberDAO dao = new ContasAreceberDAO();
        try {
         admContasAreceber = dao.consultar(id);
         if (admContasAreceber.getId()==0){
             throw new NegocioException ("Lançamento não encontrado");
         }   
         } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
         return admContasAreceber;
    }

    @Override
    public List<AdmContasAreceber> listar() throws NegocioException {
        List<AdmContasAreceber> lista = new ArrayList<AdmContasAreceber>();
        ContasAreceberDAO dao = new ContasAreceberDAO();
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
