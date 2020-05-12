/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.excepciones;

/**
 *
 * @author 4dib
 */
public class FueraRangoException extends Exception{

    @Override
    public String getMessage() {
        return "Operador fuera de rango: 1-> Suma, 2-> Resta, 3-> Multiplicación, 4-> Dvisión";
    }
    
}
