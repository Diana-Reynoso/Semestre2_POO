/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.math;

/**
 *
 * @author Dianis Silrey
 */
public interface Aritmetica {
   static final int SUMA = 1;
   
   public abstract float sumar ( float a, float b);
   public abstract float restar ( float a, float b);
   public abstract float multiplicarar ( float a, float b);
   public abstract float dividir ( float a, float b);
}
