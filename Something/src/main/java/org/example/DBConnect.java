package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private String jdbcURL = "jdbc:h2:tcp://localhost/~/test";
    private String username = "sa";
    private String password = "";

    /**
     * Remember to close the connection
     * @return
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        return connection;
    }
//        System.out.println("Connected to H2 in server mode.");
}
