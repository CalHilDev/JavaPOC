package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NameScoreTest {
    private Connection connection;
    DBConnect dbc = new DBConnect();

    @BeforeEach
    public void setUp() throws SQLException {
        connection = dbc.getConnection();
    }

    @Test
    public void testConnection() throws SQLException {
        assertNotNull(connection);
    }
}
