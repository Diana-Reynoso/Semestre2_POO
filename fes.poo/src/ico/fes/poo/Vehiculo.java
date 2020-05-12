/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author 4dib
 */
public class Vehiculo {
    private String marca;
    private int modelo;
    private String color;
    private Chasis cha;
    private Llanta llan1;
    private Llanta llan2;
    private Llanta llan3;
    private Llanta llan4;
    private Motor mot;

    public Vehiculo() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Chasis getCha() {
        return cha;
    }

    public void setCha(Chasis cha) {
        this.cha = cha;
    }

    public Llanta getLlan1() {
        return llan1;
    }

    public void setLlan1(Llanta llan1) {
        this.llan1 = llan1;
    }

    public Llanta getLlan2() {
        return llan2;
    }

    public void setLlan2(Llanta llan2) {
        this.llan2 = llan2;
    }

    public Llanta getLlan3() {
        return llan3;
    }

    public void setLlan3(Llanta llan3) {
        this.llan3 = llan3;
    }

    public Llanta getLlan4() {
        return llan4;
    }

    public void setLlan4(Llanta llan4) {
        this.llan4 = llan4;
    }

    public Motor getMot() {
        return mot;
    }

    public void setMot(Motor mot) {
        this.mot = mot;
    }
            
}
