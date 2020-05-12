/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesjava;

import ico.fes.excepciones.FueraRangoException;
import ico.fes.poo.Calculadora;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 4dib
 */
public class ExcepcionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 10;
        System.out.print("Asigna un valor a y: ");
        int y = teclado.nextInt();
        int w = 0;
        int z = 0;
        System.out.println("Dividir enteros");
       try{
        z = x / y;
        w = 10 / Integer.parseInt("fv3");
       }
       catch(ArithmeticException e){
           JOptionPane.showMessageDialog(null, "No se permite introducir el número 0.");
       }
       catch (NumberFormatException e){
           System.out.println("No es un String válido para un número.");
       }
       catch (Exception e){
           System.out.println("Todos los demás errores no identificados.");
       }
       finally{
           y = 0;
       }
        System.out.println("Resultado: " + z);
        System.out.println("W = " + w);
        System.out.println("Fin del programa");
        System.out.println("Si se imprime ésta línea, todo salió bien.");
        
        System.out.println("Ejemplo de calculadora");
        Calculadora calc = new Calculadora();
        calc.setOperando1(10.0f);
        calc.setOperando2(4.0f);
        try {
            calc.setOperador(0);
        } catch (FueraRangoException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
       
        calc.calcular();
        
    }
    
}
