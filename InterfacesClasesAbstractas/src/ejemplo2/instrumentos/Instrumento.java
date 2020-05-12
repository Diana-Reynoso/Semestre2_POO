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
public interface Instrumento {
    
   public static final int GUITARRA = 1;
   public static final int PIANO = 1;
   public static final int FLAUTA = 1;
   
   public abstract boolean afinar();
   public abstract String emitirSonido();
   public abstract void limpiar();
}
