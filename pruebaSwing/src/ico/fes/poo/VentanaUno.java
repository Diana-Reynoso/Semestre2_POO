/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 4dib
 */
public class VentanaUno extends JFrame {
    
    private JTextField txtNombre;
    private JButton btnButton1;
    
    public VentanaUno() throws HeadlessException {
        
        this.setTitle("Hola desde casa");
        this.setSize(500, 300);
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando ventana");
                System.exit(0);
            }
            
        });
        
        this.getContentPane().setLayout(new FlowLayout());
        txtNombre = new JTextField();
        txtNombre.setColumns(15);
        btnButton1 = new JButton("¡Presióname!");
        this.getContentPane().add(txtNombre);
        this.getContentPane().add(btnButton1);
        
        btnButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nombre = txtNombre.getText();
                JOptionPane.showMessageDialog(null, "Hola " + nombre);
            }
            
        });
        
        this.setVisible(true);
    }
    
}
