package com.hexaware.dao;

import java.sql.Connection;

import com.hexaware.util.DBConnection;


public class CourierServiceDb {
    private static Connection connection;

    // Constructor to assign the connection obtained from DBConnection class
    public CourierServiceDb() {
        connection = DBConnection.getConnection();
    }

    // Other methods for CourierServiceDb class can be added here

    // Example method using the connection
    public void performDatabaseOperation() {
        try {
            // Use the connection to perform database operations
            // Example:
            // PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM your_table");
            // ResultSet resultSet = preparedStatement.executeQuery();
            // Process the resultSet or perform other database operations
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
    }

    // Method to close the connection (if needed)
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions appropriately and correctly
        }
    }
}




















