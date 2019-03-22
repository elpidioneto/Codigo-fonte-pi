package br.iesb.meuprograma.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexaoBD {

    public static Connection getConexao() throws DadosException {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/academico","root","");
            return conexao;
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar JDBC: " + e.getMessage());
        } catch (SQLException e) {
            throw new DadosException("Erro ao conectar com SGBD: " + e.getMessage());
        }
    }
}
