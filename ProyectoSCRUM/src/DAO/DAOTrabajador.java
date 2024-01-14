/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Conexion.ConexionBD;
import Entidades.Trabajador;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class DAOTrabajador {
    public DAOTrabajador () {
        
    }
    
    public void add(Trabajador trabajador){
    Connection conexion = new ConexionBD().getConexion();
    
    try {
			String sql = "INSERT INTO trabajadores VALUES(?,?,?,?,?,?)";
			//Uso una plataforma "Preparada"
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			//rellenar las interrogaciones
			plataforma.setString(1, trabajador.getDNI());
                        plataforma.setString(2, trabajador.getNombre());
                        plataforma.setString(3, trabajador.getApellidos());
                        plataforma.setDouble(4, trabajador.getSueldo()); 
                        String fecha = trabajador.getFechaDia()+"/"+trabajador.getFechaMes()+"/"+trabajador.getFechaAno();
                        plataforma.setString(5, fecha);
                        plataforma.setString(6, trabajador.getMatricula());
			plataforma.executeUpdate();

			//cerrar la conexi�n
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error insertando Trabajador");
			e.printStackTrace();
		}
    }
    
    public void delete (Trabajador trabajador) {
        Connection c = new ConexionBD().getConexion(); //Se pide la conexión a la BD
        
        String query = "DELETE FROM Trabajadores WHERE dni = ?"; //Se prepara la sentencia para eliminar a un trabajador en específico
        
        try {
            PreparedStatement ps = c.prepareStatement(query); //Se declara la clase para realizar la sentencia
            ps.setString(1, trabajador.getDNI()); //Se remplaza la interrogante con el dni del trabajador proporcionado
            ps.executeUpdate(); //Se ejecuta la sentencia
            
            c.close(); //Se cierra la conexión
        } catch (SQLException e) {
            e.printStackTrace(); //ERROR | NO SE HA PODIDO BORRAR
        }
    }
    
    public void update(Trabajador trabajador) {
		//pedir la conexi�n
		 Connection conexion = new ConexionBD().getConexion();

		try {
			String sql = "UPDATE trabajadores SET nombre = ?, apellidos = ?, sueldo = ?, fecha = ?, matricula = ? WHERE dni = ?";
			//Uso una plataforma "Preparada"
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			//rellenar las interrogaciones
                        plataforma.setString(1, trabajador.getNombre());
                        plataforma.setString(2, trabajador.getApellidos());
                        plataforma.setDouble(3, trabajador.getSueldo()); 
                        String fecha = trabajador.getFechaDia()+"/"+trabajador.getFechaMes()+"/"+trabajador.getFechaAno();
                        plataforma.setString(4, fecha);
                        plataforma.setString(5, trabajador.getMatricula());
                        plataforma.setString(6, trabajador.getDNI());
			plataforma.executeUpdate();

			//cerrar la conexi�n
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error actualizando Persona");
			e.printStackTrace();
		}
	}

    public ArrayList<Trabajador> filtrarTrabajadoresConConsulta(String consulta) throws SQLException {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        Connection c = new ConexionBD().getConexion();
        PreparedStatement statement = c.prepareStatement(consulta);
        ResultSet resultSet = statement.executeQuery();
        try {

            

            while (resultSet.next()) {
                String dni = resultSet.getString("dni");
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                Double sueldo = Double.parseDouble(resultSet.getString("sueldo"));
                
                String [] fecha = resultSet.getString("fecha").split("/");
                
                Integer fDia = Integer.parseInt(fecha [0]);
                Integer fMes = Integer.parseInt(fecha [1]);
                Integer fAno = Integer.parseInt(fecha [2]);
                
                String matricula = resultSet.getString("matricula");
                
                //Se crea un objeto trabajador con las variables
                Trabajador t = new Trabajador(dni, nombre, apellidos, sueldo, fDia, fMes, fAno, matricula);

                trabajadores.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return trabajadores;
    }
    
    public List<Trabajador> obtenerTrabajadoresFiltrados(DefaultTableModel model) {
        List<Trabajador> trabajadoresFiltrados = new ArrayList<>();

        // Recorrer las filas de la tabla y obtener los trabajadores filtrados
        for (int i = 0; i < model.getRowCount(); i++) {
            Trabajador trabajador = new Trabajador();

            // Asumiendo que el constructor de Trabajador acepta los valores necesarios
            trabajador.setDNI((String) model.getValueAt(i, 0));
            trabajador.setNombre((String) model.getValueAt(i, 1));
            trabajador.setApellidos((String) model.getValueAt(i, 2));
            trabajador.setSueldo((double) model.getValueAt(i, 3));
            
            // Obtener la cadena de fecha desde el modelo de la tabla
            String fechaString = (String) model.getValueAt(i, 4);

            // Dividir la cadena de fecha en día, mes y año
            String[] fecha = fechaString.split("/");

            // Convertir los componentes de la fecha a enteros
            Integer fDia = Integer.parseInt(fecha[0]);
            Integer fMes = Integer.parseInt(fecha[1]);
            Integer fAno = Integer.parseInt(fecha[2]);

            // Establecer la fecha en el objeto trabajador
            trabajador.fechaDia(fDia);
            trabajador.fechaMes(fMes);
            trabajador.fechaAno(fAno);
            
            trabajador.setMatricula((String) model.getValueAt(i, 5));

            trabajadoresFiltrados.add(trabajador);
        }

        return trabajadoresFiltrados;
    }
    
    public ArrayList<Trabajador> get () {
        ArrayList<Trabajador> listaT = new ArrayList<Trabajador>(); //Se crea una ArrayList para guardar los trabajadores de la Sentencia
        
        Connection c = new ConexionBD().getConexion(); //Se pide la conexión a la BD
        
        String query = "SELECT * FROM Trabajadores"; //Se prepara la sentencia para mostrar todos los trabajadores de la BD
        
        try {
            PreparedStatement ps = c.prepareStatement(query); //Se declara la clase para realizar la sentencia
            ResultSet result = ps.executeQuery(); //Se declara la clase para guardar el resultado de la sentencia
            
            while (result.next()) { //Búcle para recorrer todos los resultados
                //Se declaran variables que obtienen los resultados de la sentencia
                String dni = result.getString("dni");
                String nombre = result.getString("nombre");
                String apellidos = result.getString("apellidos");
                Double sueldo = Double.parseDouble(result.getString("sueldo"));
                
                String [] fecha = result.getString("fecha").split("/");
                
                Integer fDia = Integer.parseInt(fecha [0]);
                Integer fMes = Integer.parseInt(fecha [1]);
                Integer fAno = Integer.parseInt(fecha [2]);
                
                String matricula = result.getString("matricula");
                
                //Se crea un objeto trabajador con las variables
                Trabajador t = new Trabajador(dni, nombre, apellidos, sueldo, fDia, fMes, fAno, matricula);
                
                listaT.add(t); //Se añade el trabajador a la ArrayList
            }
            
            c.close(); //Se cierra la conexión
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaT; //Se devuelve la ArrayList con todos los trabajadores que se han obtenido de la consulta
    }
}