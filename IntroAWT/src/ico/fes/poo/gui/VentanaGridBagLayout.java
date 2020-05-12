/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui; //Graphic User Interface

import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;

/**
 *
 * @author Dianis Silrey
 */
public class VentanaGridBagLayout extends Frame {

    private String titulo;
    private int alto;
    private int ancho;
    private Button boton0 = new Button("Botón 0");
    private Button boton1 = new Button("Botón 1");
    private Button boton2 = new Button("Botón 2");
    private Button boton3 = new Button("Botón 3");
    private GridBagConstraints constraints = new GridBagConstraints();

    public VentanaGridBagLayout() throws HeadlessException {
    }

    public VentanaGridBagLayout(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        this.setLayout(new GridBagLayout());
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        this.add(boton0, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.add(boton1, constraints);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.add(boton2, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.add(boton3, constraints);
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
