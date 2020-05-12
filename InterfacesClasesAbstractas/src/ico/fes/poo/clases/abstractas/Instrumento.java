/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clases.abstractas;

/**
 *
 * @author Dianis Silrey
 */
public abstract class Instrumento {
    private int anioConstrucción;
    private String marca;

    public Instrumento() {
    }

    public Instrumento(int anioConstrucción, String marca) {
        this.anioConstrucción = anioConstrucción;
        this.marca = marca;
    }

    public int getAnioConstrucción() {
        return anioConstrucción;
    }

    public void setAnioConstrucción(int anioConstrucción) {
        this.anioConstrucción = anioConstrucción;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void obtenerTipoDeInstrumento(){
        System.out.println("Instrumento...");
    }
    
    public abstract void tocar();
    public abstract void afinar();
    
}
