package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryData {
    /**
     * queries the data
     * @param con = connection to a database
     * @throws SQLException if problems getting data
     */
    public void queryData(Connection con) throws SQLException{

        String sql = "SELECT * FROM NameScore";

        Statement statement = con.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while (resultSet.next()) {
            count++;

            int score = resultSet.getInt("Score");
            String name = resultSet.getString("Name");
            System.out.println("NameScore #" + count + ": " + score + ", " + name);
        }
    }
}
