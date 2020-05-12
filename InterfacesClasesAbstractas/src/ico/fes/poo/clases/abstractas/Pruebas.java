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
public class Pruebas {
    public static void main(String[] args) {
        Guitarra g = new Guitarra(6,1967, "Gibson");
        Flauta f = new Flauta(7, "Travesera", 1974, "Pearl Flutes");
        Piano p = new Piano("Roble", "De media cola", 1992, "Petrof");
        
        System.out.println(g.getAnioConstrucción());
        g.afinar();
        g.tocar();
        System.out.println("*******************************************");
        System.out.println(f.getTipoFlauta());
        f.afinar();
        f.tocar();
        System.out.println("*******************************************");
        System.out.println(p.getMarca());
        p.afinar();
        p.tocar();
        
        
    }
    
}
