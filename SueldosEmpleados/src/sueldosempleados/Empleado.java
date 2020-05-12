/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldosempleados;

/**
 *
 * @author 4dib
 */
public class Empleado {

    private String nombre;
    private String departamento;
    private float sueldoDiario;
    private int diasTrabajados;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(String nombre, String departamento, float sueldoDiario, int diasTrabajados, int horasExtra) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(float sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public float sueldoMensual(){
        float sueldoMen = sueldoDiario * diasTrabajados;
        return sueldoMen;
    }    
    
    public float sueldoExtra(){
        float sueldoExt = horasExtra * 85;
        return sueldoExt;
    }
    
    public String toString() {
        String total = ("-------------------------------------"
                + "\nNombre del empleado: " + nombre
                + "\nSueldo mensual: $" + sueldoMensual()
                + "\nSueldo horas extra: $" + sueldoExtra());
        return total;
        
    }
    
    
}
