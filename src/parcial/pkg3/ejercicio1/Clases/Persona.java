package parcial.pkg3.ejercicio1.Clases;
public class Persona {
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected int edad;
    protected float estatura;
    protected float peso;

    public Persona(String nombre, String paterno, String materno, int edad, float estatura, float peso) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
   public String imprimirDatos(){
    return "Datos desde la clase Persona: "+nombre+" "+paterno+" "+materno+"  "+estatura+"  "+peso;
    }
}

