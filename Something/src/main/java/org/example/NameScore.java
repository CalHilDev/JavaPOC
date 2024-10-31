package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class NameScore {
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:h2:tcp://localhost/~/test";
        String username = "sa";
        String password = "1234";

        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        System.out.println("Connected to H2 in server mode.");

        String sql = "SELECT * FROM NameScore";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while (resultSet.next()) {
            count++;

            int score = resultSet.getInt("Score");
            String name = resultSet.getString("Name");
            System.out.println("NameScore #" + count + ": " + score + ", " + name);
        }

        connection.close();
    }
}
