package br.com.ifrs.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/DespesasDB", "postgres", "123456789");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
