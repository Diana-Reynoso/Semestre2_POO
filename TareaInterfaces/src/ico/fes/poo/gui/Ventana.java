/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diana Reynoso
 */
public class Ventana extends JFrame {

    private String titulo;
    private int alto;
    private int ancho;
    private JTextField nombre;
    private JButton boton;
    private JOptionPane bienvenida;
    private JLabel mensaje;

    public Ventana() throws HeadlessException {
    }

    public Ventana(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        nombre = new JTextField("Escribe tu nombre", 18);
        boton = new JButton("Saludar");
        bienvenida = new JOptionPane(mensaje);
        mensaje = new JLabel("Bienvenido");
        this.setLayout(new FlowLayout());
        this.add(boton);
        super.add(nombre);
        this.add(bienvenida);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                mensaje.setText("Bienvenido/a " + nombre.getText() );
                JOptionPane.showMessageDialog(null, "Bienvenido/a " + nombre.getText());
            }

        });
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });
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
