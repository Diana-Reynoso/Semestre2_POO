/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.instrumentos;

/**
 *
 * @author Dianis Silrey
 */
public class UsarInstrumentos {
    public static void main(String[] args) {
        Guitarra g = new Guitarra();
        Piano p = new Piano();
        Flauta f = new Flauta();
        
        System.out.println(g.emitirSonido());
        System.out.println("-------------------------------------");
        System.out.println(p.emitirSonido());
        System.out.println("-------------------------------------");
        System.out.println(f.emitirSonido());
        System.out.println("-------------------------------------");
        System.out.println(g.afinar());
        System.out.println("-------------------------------------");
        System.out.println(p.afinar());
        System.out.println("-------------------------------------");
        System.out.println(f.afinar());
        System.out.println("-------------------------------------");
    }
}
