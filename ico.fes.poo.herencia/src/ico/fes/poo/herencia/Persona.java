/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.herencia;

/**
 *
 * @author 4dib
 */
public class Persona {
    private String nombre;
    private int fechaDeNacimiento;
    private String curp;
    private String sexo;

    public Persona(String nombre, int fechaDeNacimiento, String curp, String sexo) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.curp = curp;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
 
    }

 