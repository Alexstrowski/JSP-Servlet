package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.SQLException;
import java.sql.*;

public class ConexionSingleton {

    // Propiedades
    private static Connection conn = null;
    private String driver;
    private String url;
    private String usuario;
    private String password;

    
    private ConexionSingleton() {

        String url = "jdbc:mysql://localhost:3306/sakila";
        String driver = "com.mysql.jdbc.Driver";
        String usuario = "root";
        String password = "";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    } 

    
    public static Connection getConnection() {

        if (conn == null) {
            new ConexionSingleton();
        }

        return conn;
    } 
    

    
}