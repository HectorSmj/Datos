package parcial.pkg3.ejercicio1.Clases;
public class Empleado extends Persona{
    private int idempleado;

    

    public Empleado(int idempleado, String nombre, String paterno, String materno, int edad, float estatura, float peso) {
        super(nombre, paterno, materno, edad, estatura, peso);
        this.idempleado = idempleado;
    }

    public Empleado(int idempleado, String text, String text1, String text2, float est, float pes) {
        this.idempleado = idempleado;
    }

    

    public Empleado() {
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    public String imprimirDatos(){
    return "Datos desde la clase empleado: "+idempleado+" "+nombre+" "+paterno+" "+materno+"  "+estatura+"  "+peso;
    }
}
