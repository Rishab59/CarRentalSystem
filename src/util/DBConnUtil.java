package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/CarRentalDB";
    private static final String USER = "MyDBUsername";
    private static final String PASSWORD = "MyDBPassword";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!\n", e);
        }
    }
    
    // J514 - Rishab H
}
