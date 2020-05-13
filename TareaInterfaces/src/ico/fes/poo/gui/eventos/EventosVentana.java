/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Diana Reynoso
 */
public class EventosVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Abriendo ventana");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando ventana");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Minimizando ventana");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Maximizando ventana");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Activando ventana");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Desactivando ventana");
    }
    
}
