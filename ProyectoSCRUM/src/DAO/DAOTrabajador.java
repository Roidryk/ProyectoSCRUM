/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Conexion.ConexionBD;
import Entidades.Trabajador;

import java.sql.Connection;

/**
 *
 * @author Administrador
 */
public class DAOTrabajador {

   

   
    
    public DAOTrabajador(){
    
}
    
    public void add(Trabajador trabajador){
    Connection conexion = new ConexionBD().getConexion();
    
    try {
			String sql = "INSERT INTO trabajadores VALUES(?,?,?,?,?,?,?,?)";
			//Uso una plataforma "Preparada"
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			//rellenar las interrogaciones
			plataforma.setString(1, trabajador.getDNI());
                        plataforma.setString(2, trabajador.getNombre());
                        plataforma.setString(3, trabajador.getApellidos());
                        plataforma.setDouble(4, trabajador.getSueldo()); 
                        plataforma.setInt(5, trabajador.getFechaDia()); 
                        plataforma.setInt(6, trabajador.getFechaMes()); 
                        plataforma.setInt(7, trabajador.getFechaAno()); 
                        plataforma.setString(8, trabajador.getMatricula());
			plataforma.executeUpdate();

			//cerrar la conexi�n
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error insertando Trabajador");
			e.printStackTrace();
		}
    }
    
    
    public void update(Trabajador trabajador) {
		//pedir la conexi�n
		 Connection conexion = new ConexionBD().getConexion();

		try {
			String sql = "Update trabajadores set nombre = ?, apellidos = ?, sueldo = ?, fechaDia = ?, fechaMes = ?, fechaAno = ? where dni = ?";
			//Uso una plataforma "Preparada"
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			//rellenar las interrogaciones
                        plataforma.setString(1, trabajador.getNombre());
                        plataforma.setString(2, trabajador.getApellidos());
                        plataforma.setDouble(3, trabajador.getSueldo()); 
                        plataforma.setInt(4, trabajador.getFechaDia()); 
                        plataforma.setInt(5, trabajador.getFechaMes()); 
                        plataforma.setInt(6, trabajador.getFechaAno()); 
                        plataforma.setString(7, trabajador.getMatricula());
                        plataforma.setString(8, trabajador.getDNI());
			plataforma.executeUpdate();

			//cerrar la conexi�n
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error actualizando Persona");
			e.printStackTrace();
		}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    public Trabajador get(String dni) {
		//Preparo una variable para guardar el objeto que busco
		Trabajador t = null;
		//pedir la conexi�n
		 Connection conexion = new ConexionBD().getConexion();

		try {
			//Lanzar un SELECT
			String sql = "SELECT * FROM trabajadores WHERE dni=?";
			//Uso una plataforma "Preparada"
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setString(1, dni); //rellenamos el dni en la ?
			ResultSet resultado = plataforma.executeQuery();

			if(resultado.next()) { //si ha venido una tupla, la trabajamos
				//tratamiento de la tupla
				t = new Trabajador(resultado.getString("dni"), resultado.getString("nombre"), resultado.getString("apellido"),  resultado.getDouble("Sueldo"),resultado.getInt("FechaDia"),resultado.getInt("FechaMes"),resultado.getInt("FechaAno"),resultado.getString("Matricula"));
			}
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error obteniendo trabajador");
			e.printStackTrace();
		}
		return t;
	}
    }
