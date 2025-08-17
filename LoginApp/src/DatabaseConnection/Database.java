/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

/**
 *
 * @author kartikmac
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database{
private static final String URL = "jdbc:mysql://localhost:3306/mydb";
private static final String USER = "root";
private static final String PASSWORD = "kartik";
public static Connection getConnection() {
Connection connection = null;
try {
// Load the MySQL JDBC driver
Class.forName("com.mysql.cj.jdbc.Driver");
// Establish the connection
connection = DriverManager.getConnection(URL, USER, PASSWORD);
System.out.println("Connected to MySQL database!");
} catch (ClassNotFoundException | SQLException e) {
System.err.println("Connection error: " + e.getMessage());
}
return connection;
}
public static void main(String[] args) {
getConnection();
}
}
