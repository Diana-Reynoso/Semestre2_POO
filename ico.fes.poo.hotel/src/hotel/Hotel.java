/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author 4dib
 */
public class Hotel {

    private String habitacion;
    private String todoIncluido;
    private String vista;
    private int precioTotal;
    private int noches;

    public Hotel() {
    }

    public Hotel(String habitacion, String todoIncluido, String vista, int precioTotal, int noches) {
        this.habitacion = habitacion;
        this.todoIncluido = todoIncluido;
        this.vista = vista;
        this.precioTotal = precioTotal;
        this.noches = noches;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getTodoIncluido() {
        return todoIncluido;
    }

    public void setTodoIncluido(String todoIncluido) {
        this.todoIncluido = todoIncluido;
    }

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }
    
    public void elegirHabitacion(String cuarto) {
        if ("Sencilla".equals(cuarto) || "sencilla".equals(cuarto) || "SENCILLA".equals(cuarto)) {
            precioTotal = 1600;
        } else if ("Doble".equals(cuarto) || "doble".equals(cuarto) || "DOBLE".equals(cuarto)) {
            precioTotal = 2650;
        } else if ("Suite".equals(cuarto) || "suite".equals(cuarto) || "SUITE".equals(cuarto)) {
            precioTotal = 4890;
        } else if ("King".equals(cuarto) || "king".equals(cuarto) || "KING".equals(cuarto)) {
            precioTotal = 6250;
        } else if ("Presidencial".equals(cuarto) || "presidencial".equals(cuarto) || "PRESIDENCIAL".equals(cuarto)) {
            precioTotal = 8100;
        } else {
            System.out.println("Error al elegir la habitación, vuelva a intentarlo.");
            return;
        }
    }

    public void cargarTodoIncluido(String todoIn) {
        if ("si".equals(todoIn) || "Si".equals(todoIn) || "SI".equals(todoIn)) {
            switch (precioTotal) {
                case 1600:
                    precioTotal = 2200;
                    break;
                case 2650:
                    precioTotal = 3650;
                    break;
                case 4890:
                    precioTotal = 5950;
                    break;
                case 6250:
                    precioTotal = 7850;
                    break;
                case 8100:
                    precioTotal = 9950;
                    break;
                default:
                    break;
            }
        }

    }

    public void elegirVista(String vista) {
        if ("Mar".equals(vista) || "mar".equals(vista) || "MAR".equals(vista)) {
            precioTotal = precioTotal + 350;
        } else if ("Golf".equals(vista) || "golf".equals(vista) || "GOLF".equals(vista)) {
            precioTotal = precioTotal + 200;
        }

    }
    
    public void definirNoches (int totalNoches){
        if (totalNoches > 1){
            precioTotal = precioTotal * totalNoches;
        }
    }

    @Override
    public String toString() {
        System.out.println("                               HOTEL DIAMOND INN                              \n"
                + "______________________________________________________________________________\n"
                + "Horarios de entrada a las 3:00 pm\n"
                + "Horarios de salida del hotel a las 12:00 pm\n"
                + "______________________________________________________________________________\n"
                + "Tarifas por noche\n"
                + "Tipos de habitación: \n"
                + "- Sencilla (cama matrimonial): $1600.00\n"
                + "- Doble (Dos camas matrimoniales): $2650.00\n"
                + "- Suite (mini bar, jacuzzi cama King size): $4890.00\n"
                + "- King (sala, mini bar, alberca, cama King size): $6250.00\n"
                + "- Presidencial (recibidor, sala, bar, alberca, dos camas King size) $8100.00 \n"
                + "______________________________________________________________________________\n"
                + "TODO INCLUIDO \n"
                + "------------------------------------------------------------------------------\n"
                + "* Servicio a la habitación\n"
                + "* Acceso al restaurante-bar\n"
                + "* Acceso a los conciertos y espectáculos dentro del hotel\n"
                + "* Pulsera para barra libre (24hrs)\n"
                + "------------------------------------------------------------------------------\n"
                + "Precios todo incluido: \n"
                + "- Sencilla (cama matrimonial): $2200.00\n"
                + "- Doble (Dos camas matrimoniales): $3650.00\n"
                + "- Suite (mini bar, jacuzzi cama King size):$5950.00\n"
                + "- King (sala, mini bar, alberca, cama King size): $7850.00\n"
                + "- Presidencial (recibidor, sala, bar, alberca, dos camas King size) $9950.00 \n"
                + "______________________________________________________________________________\n"
                + "Tipo de vista:\n"
                + "Mar, un cargo extra de $350.00 por habitación\n"
                + "Golf, un cargo extra de $200.00 por habitación\n"
                + "______________________________________________________________________________\n"
                + "NO INCLUYE PROPINAS\n"
                + "SERVICIOS DE SPA NO INCLUIDOS\n"
                + "SERVICIOS DE TRANSPORTE NO INCLUIDOS\n"
                + "______________________________________________________________________________\n");
        return null;
    }

    
    
    }


