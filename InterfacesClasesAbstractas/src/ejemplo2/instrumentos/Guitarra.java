/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.instrumentos;

/**
 *
 * @author Dianis Silrey
 */
public class Guitarra implements Instrumento {

    private int tipoInstrumento;

    public Guitarra() {
    }

    public Guitarra(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public int getTipoInstrumento() {
        return Instrumento.GUITARRA;
    }

    public void setTipoInstrumento(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    @Override
    public boolean afinar() {
        boolean afinado = false;
        System.out.println("Presionando traste 3 cuerda 5 y comparar sonido");
        System.out.println("Detener hasta que el sonido sea igual");
        System.out.println("Hacer el mismo procedimiento hasta llegar a cuerda 1");
        afinado = true;
        return afinado;
    }

    @Override
    public String emitirSonido() {
        String sonido = "";
        sonido = "Tara...tara...la guitarra";
        return sonido;
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el brazo");
        System.out.println("Limpiando el cuerpo");
        System.out.println("Limpiano la maquinaria de la guitarra");
    }

}
