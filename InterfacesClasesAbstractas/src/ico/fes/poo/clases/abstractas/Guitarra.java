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
public class Guitarra extends Instrumento{
    private int numeroCuerdas;

    public Guitarra() {
    }

    public Guitarra(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public Guitarra(int numeroCuerdas, int anioConstrucción, String marca) {
        super(anioConstrucción, marca);
        this.numeroCuerdas = numeroCuerdas;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public void afinar() {
        System.out.println("Presionando el traste 2 cuerda 6");
        System.out.println("Tocando cuerda 5");
        System.out.println("Ajustar hasta que ambas cuerdas suenen igual ");
        System.out.println("Repetir operación hasta cuerda 1");
    }

    @Override
    public void tocar() {
        System.out.println("Tara tara la guitarra");
    }
    
    
}
