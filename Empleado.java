package Tarea3;

public class Empleado extends Persona{
    private int salario;
    private String fecha;

    public Empleado(){
        super();
        salario = 0;
        fecha = "";
    }

    public Empleado(String pNom, int pId, int pTel, String pDir, String pCorreo, int pSal, String pFecha){
        super(pNom, pId, pTel, pDir, pCorreo);
        salario = pSal;
        fecha = pFecha;
    }

    public void setSalario(int pSal){
        salario = pSal;
    }

    public void setFecha(String pFecha){
        fecha = pFecha;
    }

    public int getSalario(){
        return salario;
    }

    public String getFecha(){
        return fecha;
    }

    public String toString(){
        return  super.toString() + "\n Salario: " + salario + "\n Fecha: " + fecha;
    }
}
