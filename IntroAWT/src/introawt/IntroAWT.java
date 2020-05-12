/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introawt;

import ico.fes.poo.gui.Ventana;
import ico.fes.poo.gui.Ventana1;
import ico.fes.poo.gui.Ventana2;
import ico.fes.poo.gui.Ventana3;

/**
 *
 * @author Dianis Silrey
 */
public class IntroAWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ven = new Ventana("Hola mundo GUI Java 1", 600, 400);
        ven.setVisible(true);
        
        Ventana1 ven1 = new Ventana1("Hola mundo GUI Java 2", 600, 400);
        ven1.setVisible(true);
        
        Ventana2 ven2 = new Ventana2("Hola mundo GUI Java 3", 600, 400);
        ven2.setVisible(true);
        
        Ventana3 ven3 = new Ventana3("Hola mundo GUI Java 4", 600, 400);
        ven3.setVisible(true);
        
        
    }
    
}
