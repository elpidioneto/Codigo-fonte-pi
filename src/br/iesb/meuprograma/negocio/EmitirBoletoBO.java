/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

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
    }

    @Override
    public void alterar(EmitirBoleto entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getId());
    }

    @Override
    public void excluir(EmitirBoleto entidade) throws NegocioException {
       consultar(entidade.getId());
    }

    @Override
    public EmitirBoleto consultar(int id) throws NegocioException {
        return new EmitirBoleto();        
    }

    @Override
    public List<EmitirBoleto> listar() throws NegocioException {
        return new ArrayList<EmitirBoleto>();
    }
    
}
