package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Login;
import br.iesb.meuprograma.negocio.BO;
import br.iesb.meuprograma.negocio.BO;
import br.iesb.meuprograma.negocio.NegocioException;
import br.iesb.meuprograma.negocio.NegocioException;
import java.util.ArrayList;
import java.util.List;

public class LoginBO  implements BO<Login>{

    @Override
    public void validar(Login entidade) throws NegocioException {
        if (entidade.getLogin() == null || entidade.getLogin().trim().equals("") ) {
        throw new NegocioException("O campo Login não pode ser vazio");}
        }

    @Override
    public void inserir(Login entidade) throws NegocioException {
        validar(entidade); 
    }

   @Override
    public void alterar(Login entidade) throws NegocioException {
      validar(entidade);
        Login consultar = consultar(entidade.getId());
    }

    @Override
    public void excluir(Login entidade) throws NegocioException {
        validar(entidade);
    }

    @Override
    public Login consultar(int id) throws NegocioException {
        return new Login();
    }

    @Override
    public List<Login> listar() throws NegocioException {
        return new ArrayList<>();
    } 
     


}
