package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Titulo;
import java.util.ArrayList;
import java.util.List;

public class TituloBO  implements BO<Titulo>{
      
    @Override
    public void validar(Titulo entidade) throws NegocioException {
        if (entidade.getTitulo() == null || entidade.getTitulo().trim().equals("") ) {
        throw new NegocioException("O campo Titulo não pode ser vazio"); }
    }
@Override
    public void inserir(Titulo  entidade) throws NegocioException {
        validar(entidade); 
    }

    @Override
    public void alterar(Titulo  entidade) throws NegocioException {
       validar(entidade);
        Titulo consultar = consultar(entidade.getId()); 
    }

    @Override
    public void excluir(Titulo  entidade) throws NegocioException {
       validar(entidade);
    }

    @Override
    public Titulo  consultar(int id) throws NegocioException {
        return new Titulo();
    }

    @Override
    public List<Titulo> listar() throws NegocioException {
      return new ArrayList<>();
    }
}
