
package herencia;


public class Trabajador extends Persona{
    private float salario;
    private String rfc;
    private String puesto;
    private int añoDeIngreso;

    public Trabajador(float salario, String rfc, String puesto, int añoDeIngreso, String nombre, int fechaDeNacimiento, String curp, String sexo) {
        super(nombre, fechaDeNacimiento, curp, sexo);
        this.salario = salario;
        this.rfc = rfc;
        this.puesto = puesto;
        this.añoDeIngreso = añoDeIngreso;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }
    
    
    
    public void MostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nFecha de nacimiento: "+getFechaDeNacimiento()+
                "\nCurp: "+getCurp()+
                "\nSexo: "+getSexo()+
                "\nSalario: "+salario+
                "\nRFC: "+rfc+
                "\nPuesto: "+puesto+
                "\nAño de ingreso: "+añoDeIngreso);
    }
    
}
