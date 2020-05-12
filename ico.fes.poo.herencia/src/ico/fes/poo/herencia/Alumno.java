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
public class Alumno extends Persona{
    private int numeroDeCuenta;
    private String carrera;
    private float promedio;

    public Alumno(int numeroDeCuenta, String carrera, float promedio, String nombre, int fechaDeNacimiento, String curp, String sexo) {
        super(nombre, fechaDeNacimiento, curp, sexo);
        this.numeroDeCuenta = numeroDeCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    
    
    
     public void MostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nFecha de nacimiento: "+getFechaDeNacimiento()+
                "\nCurp: "+getCurp()+
                "\nSexo: "+getSexo()+
                "\nNumero de cuenta: "+numeroDeCuenta+
                "\nCarrera: "+carrera+
               "\nPromedio: "+promedio);
    }
}
