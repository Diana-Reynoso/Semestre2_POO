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
public class Cerebro {
    private float peso;
    private String funcion;
    private String tamanio;

    public Cerebro() {
    }

    public Cerebro(float peso, String funcion, String tamanio) {
        this.peso = peso;
        this.funcion = funcion;
        this.tamanio = tamanio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    public void pensar(){
        System.out.println("Pensanding...");
    }
    public void recordar(){
        System.out.println("Recordanding...");
    }
    @Override
    public String toString() {
      String resultado = "Tamaño: " +this.tamanio;
      resultado=resultado+"\nFunción: "+this.funcion;
      resultado=resultado+"\nPeso: "+this.peso;
      return resultado;
    }
}
