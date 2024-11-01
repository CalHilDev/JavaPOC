package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class HighScore {
    //orchestrator
    void run() throws SQLException {
        DBConnect dbc = new DBConnect();
        Connection connection = dbc.getConnection();
        CreateData cd = new CreateData();
        cd.createData(connection);
        cd.insertData(connection, "BigDonny", 270);
        cd.deleteData(connection, 3);
        cd.updateData(connection, 1, "Helreka", 69);
        QueryData qd = new QueryData();
        qd.queryData(connection);
        connection.close();
    }
}
