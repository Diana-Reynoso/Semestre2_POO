/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosintro;

import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author 4dib
 */
public class RepasoArrayList {
    public static void main(String[] args) {
        ArrayList<Computadora> lista = new ArrayList();
        lista.add(new Computadora("Toshiba", "TH2020", 13000.0f));
        lista.add(new Computadora("Apple", "Macbook Pro", 99000.0f));
        lista.add(new Computadora("Lenovo", "LN2021", 15000.0f));
        
        for (Computadora comp : lista) {
            System.out.println("+++++++++++++");
            System.out.println(comp);
        }
        
        lista.add(1, new Computadora("Acer", "Aspire 2020", 12500.0f));
        
        for (Computadora comp : lista) {
            System.out.println("--------------");
            System.out.println(comp);
        }
        
        Computadora c = lista.set(2, new Computadora("Asus", "AS2020", 14000.0f));
        
        for (Computadora comp : lista) {
            System.out.println("**************");
            System.out.println(comp);
        }
        
        System.out.println("¿Cuánto vaale c?");
        System.out.println(c);
        
        System.out.println("Remove:");
        Computadora d= lista.remove(1);
        
        for (Computadora comp : lista) {
            System.out.println("###############");
            System.out.println(comp);
        }
        
        System.out.println("¿Cuánto vale d?");
        System.out.println(d);
        
        System.out.println("El tamaño del arreglo es:" + lista.size());
        
        System.out.println("Probando get: ");
        Computadora e = lista.get(1);
        System.out.println(e);
        
        for (Computadora comp : lista) {
            System.out.println("@@@@@@@@@@@@@@");
            System.out.println(comp);
        }
        
        System.out.println("Probando el iterador: ");
        
        Iterator<Computadora> iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        
    }
}
