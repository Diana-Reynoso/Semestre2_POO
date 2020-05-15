/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Diana Reynoso
 */
public class Ventana extends Frame {

    private TextField entrada;
    private Button boton;
    private Label etiqueta;
    
    public Ventana() throws HeadlessException {
        super.setSize(300, 300);
        super.setTitle("Repaso AWT y Eventos");
        super.setLayout(new FlowLayout());
        entrada = new TextField("Nombre", 15);
        boton = new Button("Salúdame");
        etiqueta = new Label("Sin nada que mostrar.");
        super.add(entrada);
        super.add(boton);
        super.add(etiqueta);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                etiqueta.setText("¡Hola " + entrada.getText() + "!");
            }
            
        });
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
            
        });
    }
    
}
