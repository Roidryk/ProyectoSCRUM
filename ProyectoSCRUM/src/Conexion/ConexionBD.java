/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ConexionBD {
    
    private Connection conexion;
    
    public ConexionBD() {
        try {
            // cargar el driver  JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // preparar la conexion
            String url = "jdbc:mysql://localhost/bdTrabajadores";
            
            // conectar la BD con la url, user y passwd  
            conexion = DriverManager.getConnection(url, "root", "");
                
        } catch (ClassNotFoundException e) { // Manejar errores
            System.out.println("Error en la carga del Driver");
        } catch (SQLException e) {
            System.out.println("Error conectando a la BBDD");
        }
    }

    public Connection getConexion() {
            return conexion;
    }
    
}
