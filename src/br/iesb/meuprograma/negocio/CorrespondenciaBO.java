
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Correspondencia;
import br.iesb.meuprograma.entidades.Titulo;
import br.iesb.meuprograma.negocio.BO;
import br.iesb.meuprograma.negocio.NegocioException;
import java.util.ArrayList;
import java.util.List;


public class CorrespondenciaBO implements BO<Correspondencia> {

    @Override
    public void validar(Correspondencia entidade) throws NegocioException {
      if (entidade.getDestinatario() == null || entidade.getDestinatario().trim().equals("") ) {
        throw new NegocioException("O campo Destinatario não pode ser vazio"); }
      
      if (entidade.getTransportadora() == null || entidade.getTransportadora().trim().equals("") ) {
        throw new NegocioException("O campo Trasnportadora não pode ser vazio"); }
      
      if (entidade.getRastreamento() == null || entidade.getRastreamento().trim().equals("") ) {
        throw new NegocioException("O campo Rastreamento não pode ser vazio"); }
    }

    @Override
    public void inserir(Correspondencia entidade) throws NegocioException {
         validar(entidade); 
    }

    @Override
    public void alterar(Correspondencia entidade) throws NegocioException {
         validar(entidade);
        Correspondencia consultar = consultar(entidade.getId()); 
    }

    @Override
    public void excluir(Correspondencia entidade) throws NegocioException {
         validar(entidade);
    }

    @Override
    public Correspondencia consultar(int id) throws NegocioException {
        return new Correspondencia();
    }

    @Override
    public List<Correspondencia> listar() throws NegocioException {
        return new ArrayList<>();
    }
  
    
    
}
