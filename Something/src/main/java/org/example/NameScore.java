package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NameScore {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "placeholder";
        String password = "placeholder";
        String driverName = "oracle.jdbc.driver.OracleDriver";
        Connection con;

        /*try(Connection conn = DriverManager.getConnection(url, user, password); Statement stmt = conn.createStatement()){
            String createTableSQL = "CREATE TABLE IF NOT EXISTS NameScore ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(100) NOT NULL, "
                    + "score VARCHAR(100), "
                    + ")";
            stmt.execute(createTableSQL);

        }*/

        //Connection conn = DriverManager.getConnection(url, user, password);
        //throws java.sql.SQLException;

        public static Connection getConnection() {
            try {
                Class.forName(driverName);
                try {
                    con = DriverManager.getConnection(url, user, password);
                } catch (SQLException ex) {
                    // log an exception. fro example:
                    System.out.println("Failed to create the database connection.");
                }
            } catch (ClassNotFoundException ex) {
                // log an exception. for example:
                System.out.println("Driver not found.");
            }
            return con;
        }
    }
}
