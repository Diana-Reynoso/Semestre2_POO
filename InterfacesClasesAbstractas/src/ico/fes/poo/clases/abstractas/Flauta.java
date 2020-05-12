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
public class Flauta extends Instrumento{
    private int numHoyos;
    private String tipoFlauta;
    

    public Flauta() {
    }

    public Flauta(int numHoyos, String tipoFlauta) {
        this.numHoyos = numHoyos;
        this.tipoFlauta = tipoFlauta;
    }

    public Flauta(int numHoyos, String tipoFlauta, int anioConstrucción, String marca) {
        super(anioConstrucción, marca);
        this.numHoyos = numHoyos;
        this.tipoFlauta = tipoFlauta;
    }

    public int getNumHoyos() {
        return numHoyos;
    }

    public void setNumHoyos(int numHoyos) {
        this.numHoyos = numHoyos;
    }

    public String getTipoFlauta() {
        return tipoFlauta;
    }

    public void setTipoFlauta(String tipoFlauta) {
        this.tipoFlauta = tipoFlauta;
    }
    
    @Override
    public void afinar() {
        System.out.println("Ir tocando y comparando sonidos");
        System.out.println("Hacerlo hasta el último hoyo");
        System.out.println("Terminar de afinar la flauta");
    }

    @Override
    public void tocar() {
        System.out.println("Flu... flu... la flauta");
    }
    
}
