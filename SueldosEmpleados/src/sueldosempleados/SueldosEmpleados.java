/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldosempleados;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 4dib
 */
public class SueldosEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> listaEm = new ArrayList();
        listaEm.add(new Empleado("José García Pérez", "Sistemas", 670.0f, 30, 5));
        listaEm.add(new Empleado("Diana Herrera Pérez", "Recursos humanos", 450.0f, 25, 0));
        listaEm.add(new Empleado("Jessica Juarez Días", "Ventas", 400.0f, 28, 0));
        listaEm.add(new Empleado("Pedro Paz Orozco", "Ventas", 410.0f, 30, 0));
        listaEm.add(new Empleado("José Marcel Pérez", "Sistemas", 680.0f, 29, 6));
        listaEm.add(new Empleado("Jesús Días García", "Recursos humanos", 455.0f, 30, 0));
        listaEm.add(new Empleado("Pedro Xotl Ramirez", "Sistemas", 675.0f, 27, 0));
        listaEm.add(new Empleado("Javier Medina Blanco", "Ventas", 400.0f, 30, 4));
        listaEm.add(new Empleado("Elizabeth Villa Sosa", "Sistemas", 670.0f, 30, 3));
        
        Iterator<Empleado> a = listaEm.iterator();
        float sueldoMensual;
        float sueldoExtra;
        float sueldoTotal = 0;
        while (a.hasNext()) {
            System.out.println(a.next());
            sueldoTotal = 0;
            for (int i = 0; i < 9; i++) {
                
                sueldoMensual = listaEm.get(i).getSueldoDiario() * listaEm.get(i).getDiasTrabajados();
                sueldoExtra = listaEm.get(i).getHorasExtra() * 85;
                sueldoTotal += sueldoMensual + sueldoExtra;
                
            }
        
        }
        System.out.println("-------------------------------------");
        System.out.println("El sueldo total de los empleados es: $" + sueldoTotal);  
        
        Iterator<Empleado> b = listaEm.iterator();
        int cantFlojo = 30;
        String nomFlojo = null;
        while (b.hasNext()) {
            Empleado x = (Empleado)b.next();
            
            if ( cantFlojo > x.getDiasTrabajados()){
                nomFlojo = x.getNombre();
                cantFlojo = x.getDiasTrabajados();
            
               } 
                
            }
        
        System.out.println("El trabajador más flojo es: " + nomFlojo);
            
            Iterator <Empleado> c = listaEm.iterator();
    int mayorNumero=0;
    String nombreGanador = null;
    while (c.hasNext()){
            Empleado x = (Empleado)c.next();
           if ( mayorNumero<x.getHorasExtra()) {
               nombreGanador=x.getNombre();
               mayorNumero=x.getHorasExtra();
            }
        }
        System.out.println("El trabajador mas dedicado es: " +nombreGanador);
        }
              
    
 
}
