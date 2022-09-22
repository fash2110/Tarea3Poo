import java.lang.String;

public class Funcionario extends Persona {
    private double salario;

    public Funcionario(String pNom, double pSal){
        super(pNom);
        salario = pSal;
    }

    public String toString(){
        return "\n Nombre: " + super.toString() + "\n Salario: " + String.valueOf(salario);
    }
}
