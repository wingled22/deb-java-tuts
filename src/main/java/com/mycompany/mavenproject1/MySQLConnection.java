package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class MySQLConnection {
    private Connection connection ; 

    public MySQLConnection() {
        String url = "jdbc:mysql://localhost:3306/davetest"; // Update with your database URL
        String user = "root"; // Update with your username
        String password = ""; // Update with your password
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");
         } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
}