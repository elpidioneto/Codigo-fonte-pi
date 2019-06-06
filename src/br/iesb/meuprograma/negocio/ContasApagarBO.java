
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.ContasApagarDAO;
import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.entidades.AdmContasApagar;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
            
            ContasApagarDAO dao = new ContasApagarDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
            
    }

    @Override
    public void alterar(AdmContasApagar entidade) throws NegocioException {
        validar(entidade);
        consultar (entidade.getId());
        
         ContasApagarDAO dao = new ContasApagarDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
        
    }

    @Override
    public void excluir(AdmContasApagar entidade) throws NegocioException {
       consultar (entidade.getId());
       
        ContasApagarDAO dao = new ContasApagarDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
    }

    @Override
    public AdmContasApagar consultar(int id) throws NegocioException {
 
        AdmContasApagar admContasApagar = new AdmContasApagar();
        
         ContasApagarDAO dao = new ContasApagarDAO();
        try {
         admContasApagar = dao.consultar(id);
         if (admContasApagar.getId()==0){
             throw new NegocioException ("Lançamento não encontrado");
         }   
         } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
         return admContasApagar;
    }

    @Override
    public List<AdmContasApagar> listar() throws NegocioException {
        List<AdmContasApagar> lista = new ArrayList<AdmContasApagar>();
        ContasApagarDAO dao = new ContasApagarDAO();
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
