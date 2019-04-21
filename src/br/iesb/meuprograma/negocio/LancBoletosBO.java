
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.LancBoletosDAO;
import br.iesb.meuprograma.entidades.LancBoletos;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

 public void inserir(LancBoletos entidade) throws NegocioException {
        
            validar(entidade);
            
            LancBoletosDAO dao = new LancBoletosDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
            
    }

  
     public void alterar(LancBoletos entidade) throws NegocioException {
        validar(entidade);
        consultar (entidade.getId());
        
         LancBoletosDAO dao = new LancBoletosDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        
    } 
        
    }

    @Override
    public void excluir(LancBoletos entidade) throws NegocioException {
       consultar (entidade.getId());
       
        LancBoletosDAO dao = new LancBoletosDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
    }

    @Override
    public LancBoletos consultar(int id) throws NegocioException {
 
        LancBoletos lancBoletos = new LancBoletos();
        
         LancBoletosDAO dao = new LancBoletosDAO();
        try {
         lancBoletos = dao.consultar(id);
         if (lancBoletos.getId()==0){
             throw new NegocioException ("Lançamento não encontrado");
         }   
         } catch (DadosException ex) {
           throw new NegocioException("", ex);
        }
         return lancBoletos;
    }

    @Override
    public List<LancBoletos> listar() throws NegocioException {
        List<LancBoletos> lista = new ArrayList<LancBoletos>();
        LancBoletosDAO dao = new LancBoletosDAO();
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
