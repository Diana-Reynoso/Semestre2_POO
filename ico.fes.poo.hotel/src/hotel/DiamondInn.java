/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author 4dib
 */
public class DiamondInn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel reservacion = new Hotel();
        reservacion.toString();

        System.out.println("¿Qué habitación desea? ");
        String entradaCuarto = "";
        Scanner entradaEscaner1 = new Scanner(System.in);
        entradaCuarto = entradaEscaner1.nextLine();
        reservacion.elegirHabitacion(entradaCuarto);

        System.out.println("¿Desea agregar todo incluido? ");
        String entradaTodoInc = "";
        Scanner entradaEscaner2 = new Scanner(System.in);
        entradaTodoInc = entradaEscaner2.nextLine();
        reservacion.cargarTodoIncluido(entradaTodoInc);

        System.out.println("¿Qué vista desea? ");
        String entradaVista = "";
        Scanner entradaEscaner3 = new Scanner(System.in);
        entradaVista = entradaEscaner3.nextLine();
        reservacion.elegirVista(entradaVista);

        System.out.println("¿Por cuántas noches desea realizar su reservación? ");
        Scanner entradaEscaner4 = new Scanner(System.in);
        int entradaNoches = 0;
        entradaNoches = entradaEscaner4.nextInt();
        reservacion.definirNoches(entradaNoches);

        int precioTot = (int) reservacion.getPrecioTotal();
        System.out.println("Precio total de su reservación: $" + precioTot);
    }

}
