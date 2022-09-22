public class Estudiante extends Persona{
    private int numeroCarnet;

    public Estudiante(String nombre, int numeroCarnet) {
        super(nombre);
        this.numeroCarnet = numeroCarnet;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String toString() {
        return "\n Estudiante: "+super.toString()+"\n Numero de carnet: " + numeroCarnet;
    }
}
