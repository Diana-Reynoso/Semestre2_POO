/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introawt;

import ico.fes.poo.gui.Ventana;
import ico.fes.poo.gui.VentanaBorderLayout;
import ico.fes.poo.gui.VentanaGridLayout;
import ico.fes.poo.gui.VentanaGridBagLayout;

/**
 *
 * @author Diana Reynoso
 */
public class IntroAWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ven = new Ventana("Hola mundo GUI Java 1", 600, 400);
        ven.setVisible(true);
        
        VentanaBorderLayout ven1 = new VentanaBorderLayout("Hola mundo GUI Java 2", 600, 400);
        ven1.setVisible(true);
        
        VentanaGridLayout ven2 = new VentanaGridLayout("Hola mundo GUI Java 3", 600, 400);
        ven2.setVisible(true);
        
        VentanaGridBagLayout ven3 = new VentanaGridBagLayout("Hola mundo GUI Java 4", 600, 400);
        ven3.setVisible(true);
        
        
    }
    
}
