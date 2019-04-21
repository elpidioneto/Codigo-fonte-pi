/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.VisitanteDAO;
import br.iesb.meuprograma.entidades.Visitante;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class VisitanteBO implements BO<Visitante> {

    @Override
    public void validar(Visitante entidade) throws NegocioException {
         if(entidade.getNome().isEmpty()){
      throw new NegocioException("Campo Nome é Obrigatório!");
         }
         if(entidade.getCpf().trim().length()< 14){
          throw new NegocioException("Campo CPF é Obrigatório!");
      }
         if(entidade.getRg().trim().length()<9){
        throw new NegocioException("Campo RG é Obrigatório!");
      }
         if(entidade.getTipoVisita().equals("Selecione..")){
             throw new NegocioException("Selecione o tipo de visita");
         }
         if(entidade.getDataEntrada().trim().length()<10){
             throw new NegocioException("Campo Data de Entrada é Obrigatório!");
         }
         if(entidade.getHoraEntrada().trim().length()<5){
             throw new NegocioException("Campo Hora de Entrada é Obrigatório!");
         }
    }

    @Override
    public void inserir(Visitante entidade) throws NegocioException {
        validar(entidade);
        VisitanteDAO dao= new VisitanteDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("" + ex);
        }
    }

    @Override
    public void alterar(Visitante entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getId());
        VisitanteDAO dao= new VisitanteDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("" + ex);
        }
    }

    @Override
    public void excluir(Visitante entidade) throws NegocioException {
        consultar(entidade.getId());
        VisitanteDAO dao= new VisitanteDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("" + ex);
        }        
    }

    @Override
    public Visitante consultar(int id) throws NegocioException {
        Visitante visitante = new Visitante();
        VisitanteDAO dao = new VisitanteDAO();
        try {
            visitante = dao.consultar(id);
            if(visitante.getId()==0){
            throw new NegocioException("Nenhum Registro Encontrado");
            }
        } catch (DadosException ex) {
           throw new NegocioException("" + ex);
        }
       return visitante;
    }

    @Override
    public List<Visitante> listar() throws NegocioException {
      List<Visitante> lista= new ArrayList<Visitante>();
      VisitanteDAO dao = new VisitanteDAO();
        try {
            lista= dao.listar();
            if(lista.isEmpty()){
                throw new NegocioException("Nenhum registro encontrado");
            }
        } catch (DadosException ex) {
            throw new NegocioException("" + ex);
        }
        return lista;
    }
    
}
