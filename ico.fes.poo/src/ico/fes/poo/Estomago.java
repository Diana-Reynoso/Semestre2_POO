/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author 4dib
 */
public class Estomago {
    private String tamanio;
    private String funcion;
    private float capacidad;

    public Estomago() {
    }

    public Estomago(String tamanio, String funcion, float capacidad) {
        this.tamanio = tamanio;
        this.funcion = funcion;
        this.capacidad = capacidad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    
    public void metabolizar(){
        System.out.println("Metabolizando...");
    }    
    public void disolver(){
        System.out.println("Disolviendo...");    
    }
    @Override
    public String toString() {
      String resultado = "Tamaño: " +this.tamanio;
      resultado=resultado+"\nFunción: "+this.funcion;
      resultado=resultado+"\nCapacidad: "+this.capacidad;
      return resultado;
    }
}
