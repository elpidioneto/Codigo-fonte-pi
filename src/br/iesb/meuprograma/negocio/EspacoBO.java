package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.EspacoDAO;
import br.iesb.meuprograma.entidades.Espaco;
import java.util.ArrayList;
import java.util.List;

public class EspacoBO implements BO<Espaco>

{ 
    @Override
    public void validar(Espaco entidade) throws NegocioException {
        
        if (entidade.getNome() == null || entidade.getNome().trim().equals("") ) {
        throw new NegocioException("O campo Nome do Espaço não pode ser vazio"); }
        
        if (entidade.getQtdHoras() == 0) {
        throw new NegocioException("O campo Quantidade de Horas não pode ser Zero"); }
                        
        if (entidade.getQtdReserva() == 0) {
        throw new NegocioException("O campo Quantidade de Reservas Mês não pode ser Zero"); }
        
        if (entidade.getQtdConvidados() == 0) {
        throw new NegocioException("O campo Quantidade de Convidados não pode ser Zero"); }
        
        if (entidade.getValorReserva() == 0) {
        throw new NegocioException("O campo Valor da Reserva não pode ser Zero"); }
    }

    @Override
    public void inserir(Espaco  entidade) throws NegocioException {
       validar(entidade); 
        EspacoDAO dao = new EspacoDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
    }}

    @Override
    public void alterar(Espaco entidade) throws NegocioException {
        validar(entidade);
        Espaco consultar = consultar(entidade.getId());
        EspacoDAO dao = new EspacoDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public void excluir(Espaco  entidade) throws NegocioException {
          EspacoDAO dao = new EspacoDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
    }

    @Override
    public Espaco  consultar(int id) throws NegocioException {
         Espaco espaco = new Espaco();
         EspacoDAO dao = new EspacoDAO();
        try {
           espaco = dao.consultar(id);
           if (espaco.getId()== 0)
            throw new NegocioException("Espaco não encontrado");
        } catch (DadosException ex) {
            throw new NegocioException("",ex);
        }
        return espaco;
    }

    @Override
    public List<Espaco> listar() throws NegocioException {
           List<Espaco> lista = new ArrayList<Espaco>();
    EspacoDAO dao = new EspacoDAO();
try{
lista = dao.listar();
if(lista.isEmpty()) {
throw new NegocioException("Nenhuma Conta cadastrada");
}
} catch (DadosException ex) {
throw new NegocioException("",ex);
}
return lista;
    }
    
}
