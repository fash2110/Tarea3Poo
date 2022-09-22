public class Persona {
    private String nombre;

    public Persona(String pnombre) {
        this.nombre = pnombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public String toString() {
        return this.nombre;
    }
}
