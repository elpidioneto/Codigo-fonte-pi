
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.EnderecoCorrespondenciaDAO;
import br.iesb.meuprograma.entidades.EnderecoCorrespondencia;
import br.iesb.meuprograma.negocio.BO;
import br.iesb.meuprograma.negocio.NegocioException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoCorrespondenciaBO implements BO<EnderecoCorrespondencia> {

    @Override
    public void validar(EnderecoCorrespondencia entidade) throws NegocioException {
        if (entidade.getEndereco() == null || entidade.getEndereco().trim().equals("") ) {
        throw new NegocioException("O campo Endereço não pode ser vazio"); }
        
         if (entidade.getBairro() == null || entidade.getBairro().trim().equals("") ) {
        throw new NegocioException("O campo Bairro não pode ser vazio"); }
         
          if (entidade.getCep() == null || entidade.getCep().trim().equals("") ) {
        throw new NegocioException("O campo Cep não pode ser vazio"); }
          
          if (entidade.getCidade() == null || entidade.getCidade().trim().equals("") ) {
        throw new NegocioException("O campo Cidade não pode ser vazio"); }
    }

    @Override
    public void inserir(EnderecoCorrespondencia entidade) throws NegocioException {
        validar(entidade);
        EnderecoCorrespondenciaDAO dao = new EnderecoCorrespondenciaDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void alterar(EnderecoCorrespondencia entidade) throws NegocioException {
        validar(entidade);
        EnderecoCorrespondencia consultar = consultar(entidade.getId());
    EnderecoCorrespondenciaDAO dao = new EnderecoCorrespondenciaDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
    }}

    @Override
    public void excluir(EnderecoCorrespondencia entidade) throws NegocioException {
        EnderecoCorrespondenciaDAO dao = new EnderecoCorrespondenciaDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
    }}

    @Override
    public EnderecoCorrespondencia consultar(int id) throws NegocioException {
         EnderecoCorrespondencia enderecoCorrespondencia = new EnderecoCorrespondencia(); 
        EnderecoCorrespondenciaDAO dao = new EnderecoCorrespondenciaDAO();
        try {
           enderecoCorrespondencia = dao.consultar(id);
           if (enderecoCorrespondencia.getId()== 0)
            throw new NegocioException("Endereco de Correspondencia não encontrada");
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
        return enderecoCorrespondencia;
    }

    @Override
    public List<EnderecoCorrespondencia> listar() throws NegocioException {
     List<EnderecoCorrespondencia> lista = new ArrayList<EnderecoCorrespondencia>();
    EnderecoCorrespondenciaDAO dao = new EnderecoCorrespondenciaDAO();
try{
lista = dao.listar();
if(lista.isEmpty()) {
throw new NegocioException("Nenhuma Endereço de Correspondencia cadastrado");
}
} catch (DadosException ex) {
throw new NegocioException("",ex);
}
return lista;
    }
}
