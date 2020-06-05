/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

/**
 *
 * @author Diana Reynoso
 */
public class Reloj {
    private String marca;
    private String color;
    private String material;
    private String extensible;
    private String tipo;
    private String anaDig;

    public Reloj() {
    }

    public Reloj(String marca, String color, String material, String extensible, String tipo, String anaDig) {
        this.marca = marca;
        this.color = color;
        this.material = material;
        this.extensible = extensible;
        this.tipo = tipo;
        this.anaDig = anaDig;
    }

    public String getAnaDig() {
        return anaDig;
    }

    public void setAnaDig(String anaDig) {
        this.anaDig = anaDig;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getExtensible() {
        return extensible;
    }

    public void setExtensible(String extensible) {
        this.extensible = extensible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Reloj(" + "Marca: " + marca + ", Color: " + color + ", Material: " + material + ", Extensible: " + extensible + ", Tipo: " + tipo + ", Analógico o Digital: " + anaDig + ')';
    }
    
    
}
