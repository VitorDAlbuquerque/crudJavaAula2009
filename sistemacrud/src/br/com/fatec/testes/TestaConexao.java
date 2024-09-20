package br.com.fatec.testes;

import br.com.fatec.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn;
        conn = ConnectionFactory.createConnection();// criar a conexão
        System.out.println("Conexão aberta com sucesso!");

    }
}