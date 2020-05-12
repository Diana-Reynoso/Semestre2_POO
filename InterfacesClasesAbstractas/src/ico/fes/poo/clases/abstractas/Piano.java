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
public class Piano extends Instrumento{
    private String tipoPiano;
    private String material;
    

    public Piano() {
    }

    public Piano(String material, String tipoPiano) {
        this.material = material;
        this.tipoPiano = tipoPiano;
    }

    public Piano(String material, String tipoPiano, int anioConstrucción, String marca) {
        super(anioConstrucción, marca);
        this.material = material;
        this.tipoPiano = tipoPiano;
    }

    public String getTipoPiano() {
        return tipoPiano;
    }

    public void setTipoPiano(String tipoPiano) {
        this.tipoPiano = tipoPiano;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void afinar() {
        System.out.println("Tocar las teclas");
        System.out.println("Comparar los sonidos de todas");
        System.out.println("Terminar la afinación");
    }

    @Override
    public void tocar() {
        System.out.println("Tan... tan... el piano");
    }
    
    
    
}
