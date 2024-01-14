/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Administrador
 */
public class Trabajador {

    // creacion de variables del programa
    private String DNI;
    private String nombre;
    private String apellidos;
    private double sueldo;
    private int fechaDia;
    private int fechaMes;
    private int fechaAno;
    private String matricula;

    /*  !!!!!!!!!!!!!!!!
        todo minuscula menos DNI y fechaDia fechaMes fechaAno
    */ 
    
    
    // constructor completo
    public Trabajador(String DNI, String nombre, String apellidos, double sueldo, int fechaDia, int fechaMes, int fechaAno, String matricula) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.fechaDia = fechaDia;
        this.fechaMes = fechaMes;
        this.fechaAno = fechaAno;
        this.matricula = matricula;
    }

    public Trabajador(String DNI) {
        this.DNI = DNI;
    }

    // constructor vacio
    public Trabajador() {
    }


    // getters y setters
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(int fechaDia) {
        this.fechaDia = fechaDia;
    }

    public int getFechaMes() {
        return fechaMes;
    }

    public void setFechaMes(int fechaMes) {
        this.fechaMes = fechaMes;
    }

    public int getFechaAno() {
        return fechaAno;
    }

    public void setFechaAno(int fechaAno) {
        this.fechaAno = fechaAno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // añadimos toString en caso de uso
    @Override
    public String toString() {
        return "Trabajador{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sueldo=" + sueldo + ", fechaDia=" + fechaDia + ", fechaMes=" + fechaMes + ", fechaAno=" + fechaAno + ", matricula=" + matricula + '}';
    }

    public void fechaDia(Integer fDia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void fechaMes(Integer fMes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void fechaAno(Integer fAno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
