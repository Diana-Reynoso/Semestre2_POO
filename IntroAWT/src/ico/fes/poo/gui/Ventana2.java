/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui; //Graphic User Interface

import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;

/**
 *
 * @author Dianis Silrey
 */
public class Ventana2 extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1 = new Button ("Botón 1");
    private Button boton2 = new Button ("Botón 2");
    private Button boton3 = new Button ("Botón 3");
    private Button boton4 = new Button ("Botón 4");

    public Ventana2() throws HeadlessException {
    }

    public Ventana2(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho); 
        this.setLayout(new GridLayout(2,4,6,8));
        this.add(new Button("Botón 1"));
        this.add(new Button("Botón 2"));
        this.add(new Button("Botón 3"));
        this.add(new Button("Botón 4"));
        this.addWindowListener(new EventosVentana());
    }

    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
}

