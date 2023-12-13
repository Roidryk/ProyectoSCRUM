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
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost/dbTrabajadores";

            conexion = DriverManager.getConnection(url, "root", "");
                
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la carga del Driver");
        } catch (SQLException e) {
            System.out.println("Error conectando a la BBDD");
        }
    }

    public Connection getConexion() {
            return conexion;
    }
    
}
