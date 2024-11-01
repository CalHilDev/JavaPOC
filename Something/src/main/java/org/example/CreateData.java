package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateData {
    public void createData(Connection con) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS NameScore (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(13) NOT NULL, " +
                "score INT NOT NULL)";

        try(Statement statement = con.createStatement()){
            statement.execute(createTableSQL);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void insertData(Connection con, String Name, int Score) throws SQLException {
        String insertSQL = "INSERT INTO NameScore (Name, Score) VALUES (?, ?)";
        try(PreparedStatement statement = con.prepareStatement(insertSQL)){
            statement.setString(1, Name);
            statement.setInt(2, Score);
            statement.executeUpdate();
        }
    }
    public static void deleteData(Connection con, int id) throws SQLException {
        String deleteSQL = "DELETE FROM NameScore WHERE id = ?";
        try(PreparedStatement statement = con.prepareStatement(deleteSQL)){
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
    public static void updateData(Connection con, int id, String Name, int Score) throws SQLException {
        String updateSQL = "UPDATE NameScore SET Name = ?, Score = ? WHERE id = ?";

        try(PreparedStatement statement = con.prepareStatement(updateSQL)){
            statement.setString(1, Name);
            statement.setInt(2, Score);
            statement.setInt(3, id);
            statement.executeUpdate();
        }
    }
}
