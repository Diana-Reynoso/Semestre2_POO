/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui; //Graphic User Interface

import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;

/**
 *
 * @author Dianis Silrey
 */
public class Ventana1 extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1 = new Button ("Norte");
    private Button boton2 = new Button ("Sur");
    private Button boton3 = new Button ("Este");
    private Button boton4 = new Button ("Oeste");
    private Button boton5 = new Button ("Centro");
    
    public Ventana1() throws HeadlessException {
    }

    public Ventana1(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho); 
        this.setLayout(new BorderLayout());
        this.add(new Button("Norte"), BorderLayout.NORTH);
        this.add(new Button("Sur"), BorderLayout.SOUTH);
        this.add(new Button("Este"), BorderLayout.WEST);
        this.add(new Button("Oeste"), BorderLayout.EAST);
        this.add(new Button("Centro"), BorderLayout.CENTER);
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
