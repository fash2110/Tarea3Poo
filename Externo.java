package Tarea3;

public class Externo extends Persona{
    private int limite;
    private String fecha;

    public Externo(){
        super();
        limite = 0;
        fecha = "";
    }

    public Externo(String pNom, int pId, int pTel, String pDir, String pCorreo, int pLim, String pFecha){
        super(pNom, pId, pTel, pDir, pCorreo);
        limite = pLim;
        fecha = pFecha;
    }

    public void setLimite(int pLim){
        limite = pLim;
    }

    public void setFecha(String pFecha){
        fecha = pFecha;
    }

    public int getLimite(){
        return limite;
    }

    public String getFecha(){
        return fecha;
    }

    public String toString(){
        return  super.toString() + "\n Limite: " + limite + "\n Fecha de ingreso: " + fecha;
    }
}
