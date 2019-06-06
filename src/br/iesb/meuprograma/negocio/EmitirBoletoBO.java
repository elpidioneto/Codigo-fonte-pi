/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.EmitirBoletoDAO;
import br.iesb.meuprograma.entidades.EmitirBoleto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class EmitirBoletoBO implements BO<EmitirBoleto> {

    @Override
    public void validar(EmitirBoleto entidade) throws NegocioException {
        if(entidade.getCompetencia().trim().length()<5){
            throw new NegocioException("Campo Mês/Ano Competencia é Obrigatório!");         
        }
         if(entidade.getCpf().trim().length()<14){
            throw new NegocioException("Campo CPF é Obrigatório!");
        }
    }

    @Override
    public void inserir(EmitirBoleto entidade) throws NegocioException {
        validar(entidade);
         EmitirBoletoDAO dao= new EmitirBoletoDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("" + ex);
        }
    }

    @Override
    public void alterar(EmitirBoleto entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getId());
         EmitirBoletoDAO dao= new EmitirBoletoDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("" + ex);
        }
    }

    @Override
    public void excluir(EmitirBoleto entidade) throws NegocioException {
       consultar(entidade.getId());
       EmitirBoletoDAO dao= new EmitirBoletoDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("" + ex);
        }
    }

    @Override
    public EmitirBoleto consultar(int id) throws NegocioException {
         EmitirBoleto emitirboleto = new EmitirBoleto();
        EmitirBoletoDAO dao = new EmitirBoletoDAO();
        try {
            emitirboleto = dao.consultar(id);
            if(emitirboleto.getId()==0){
            throw new NegocioException("Nenhum Registro Encontrado");
            }
        } catch (DadosException ex) {
           throw new NegocioException("" + ex);
        }
       return emitirboleto;       
    }

    @Override
    public List<EmitirBoleto> listar() throws NegocioException {
        List<EmitirBoleto> lista= new ArrayList<EmitirBoleto>();
      EmitirBoletoDAO dao = new EmitirBoletoDAO();
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
