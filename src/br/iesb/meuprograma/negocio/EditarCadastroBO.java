/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Pessoa;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class EditarCadastroBO implements BO<Pessoa>{

    @Override
    public void validar(Pessoa entidade) throws NegocioException {
        if(entidade.getNome().isEmpty() && entidade.getCpf().trim().length()<14){
            throw new NegocioException("Preenhca um dos campos!");
        }
        if(entidade.getNome().length()>0 && entidade.getCpf().trim().length()==14){
            throw new NegocioException("Preencha somente um dos campos!");
        }
    }

    @Override
    public void inserir(Pessoa entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Pessoa entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Pessoa entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa consultar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> listar() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
