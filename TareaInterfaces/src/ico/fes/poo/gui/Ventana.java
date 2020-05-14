/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diana Reynoso
 */
public class Ventana extends JFrame{
    
    private String titulo;
    private int alto;
    private int ancho;
    private JTextField nombre;
    private JButton boton;
    private JOptionPane bienvenida;

    public Ventana() throws HeadlessException {
    }

   public Ventana(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho); 
        boton = new JButton ("Saludar");
        this.setLayout(new FlowLayout());
        this.add(boton);
        nombre = new JTextField ("Nombre: ");
        this.addWindowListener(new EventosVentana());
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

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JOptionPane getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(JOptionPane bienvenida) {
        this.bienvenida = bienvenida;
    }
    
}
