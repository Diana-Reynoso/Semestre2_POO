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
public class Piano implements Instrumento{
    private int tipoInstrumento;

    public Piano() {
    }

    public Piano(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public int getTipoInstrumento() {
        return Instrumento.PIANO;
    }

    public void setTipoInstrumento(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    @Override
    public boolean afinar() {
        boolean afinado = false;
        System.out.println("Tocar y comparar sonido");
        System.out.println("Detener hasta que el sonido sea igual");
        System.out.println("Hacer el mismo procedimiento hasta llegar afinar todo");
        afinado = true;
        return afinado;
    }

    @Override
    public String emitirSonido() {
        String sonido = "";
        sonido = "Tan.... tan el piano";
        return sonido;
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando las teclas");
        System.out.println("Limpiando el cuerpo");
        System.out.println("Limpiano la maquinaria del piano");
    }

    
}
