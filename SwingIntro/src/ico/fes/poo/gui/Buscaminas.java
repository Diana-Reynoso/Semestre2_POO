/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Diana Reynoso
 */
public class Buscaminas extends JFrame{
    public static final int REN = 3;
    public static final int COL = 3;
    
    private ArrayList<BotonBuscaMinas> cuadricula;

    public Buscaminas() throws HeadlessException {
         super("Buscaminas patito v 0.1.0")    ;
         super.setSize(300, 300);
         this.getContentPane().setLayout(new GridLayout(REN, COL));
         cuadricula = new ArrayList();
         int total = REN * COL;
         for (int i = 0; i < total; i++) {
             cuadricula.add(new BotonBuscaMinas(true));
             this.getContentPane().add(cuadricula.get(i), i);
        }
    }
    
}
