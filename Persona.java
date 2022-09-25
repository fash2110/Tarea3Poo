package Tarea3;

import java.lang.String;
import java.util.ArrayList;

public class Persona{
    private String nombre;
    private int identificacion;
    private int telefono;
    private String direccion;
    private String correo;
    public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();

    public Persona(){
        nombre = "";
        identificacion = 0;
        telefono = 0;
        direccion = "";
        correo = "";
    }

    public Persona(String pNom, int pId, int pTel, String pDir, String pCorreo){
        nombre = pNom;
        identificacion = pId;
        telefono = pTel;
        direccion = pDir;
        correo = pCorreo;
    }

    public void setNombre(String pNom){
        nombre = pNom;
    }

    public void setId(int pId){
        identificacion = pId;
    }

    public void setTel(int pTel){
        telefono = pTel;
    }

    public void setDir(String pDir){
        direccion = pDir;
    }

    public void setCorreo(String pCorreo){
        correo = pCorreo;
    }

    public static void AgregarEmpleado(Empleado pEmpleado){
        empleados.add(pEmpleado);
    }

    public static void AgregarCliente(Cliente pCliente){
        clientes.add(pCliente);
    }

    public static void AgregarProveedor(Proveedor pProveedor){
        proveedores.add(pProveedor);
    }

    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return identificacion;
    }
    
    public int getTel(){
        return telefono;
    }

    public String getDir(){
        return direccion;
    }

    public String getCorreo(){
        return correo;
    }

    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public ArrayList<Proveedor> getProveedores(){
        return proveedores;
    }

    public String toString(){
        return "\n Nombre: "+ nombre + "\n Id: "+ String.valueOf(identificacion) + "\n Telefono: "+ String.valueOf(telefono) + "\n Direccion: "+ direccion + "\n Correo: "+ correo;
    }
}