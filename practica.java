public class practica {
    static Funcionario f1 = new Funcionario("Pedro", 50000.00);
    static Estudiante e1 = new Estudiante("Juan", 2022111222);

    public static void main(String[] args){
        System.out.println("Funcionario:" + f1.toString()+"\n");
        System.out.println("Estudiante:"+e1.toString());
    }
}
