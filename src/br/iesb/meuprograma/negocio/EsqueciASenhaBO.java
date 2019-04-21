package br.iesb.meuprograma.negocio;
import br.iesb.meuprograma.entidades.EsqueciASenha;
import br.iesb.meuprograma.entidades.EsqueciASenha;
import br.iesb.meuprograma.negocio.BO;
import br.iesb.meuprograma.negocio.NegocioException;
import java.util.ArrayList;
import java.util.List;

 public class EsqueciASenhaBO implements BO<EsqueciASenha> {

    @Override
    public void validar(EsqueciASenha entidade) throws NegocioException {
       if (entidade.getEmail() == null || entidade.getEmail().trim().equals("") ) {
        throw new NegocioException("O campo Email não pode ser vazio");
    }}

    @Override
    public void inserir(EsqueciASenha entidade) throws NegocioException {
      validar(entidade); 
    }

    @Override
    public void alterar(EsqueciASenha entidade) throws NegocioException {
       validar(entidade);
        EsqueciASenha consultar = consultar(entidade.getId()); 
    }

    @Override
    public void excluir(EsqueciASenha entidade) throws NegocioException {
       validar(entidade);
    }

    @Override
    public EsqueciASenha consultar(int id) throws NegocioException {
         return new EsqueciASenha();
    }

    @Override
    public List<EsqueciASenha> listar() throws NegocioException {
        return new ArrayList<>();
    }

 }