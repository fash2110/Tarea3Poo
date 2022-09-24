package Tarea3;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private int telefono;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;

    public Empresa(){
        nombre = "";
        telefono = 0;
        clientes = new ArrayList<Cliente>();
        proveedores = new ArrayList<Proveedor>();
    }

    public Empresa(String pNom, int pTel){
        nombre = pNom;
        telefono = pTel;
        clientes = new ArrayList<Cliente>();
        proveedores = new ArrayList<Proveedor>();
    }

    public void setNombre(String pNom){
        nombre = pNom;
    }

    public void setTel(int pTel){
        telefono = pTel;
    }

    public void agregarCliente(Cliente pCliente){
        clientes.add(pCliente);
    }

    public void agregarProveedor(Proveedor pProveedor){
        proveedores.add(pProveedor);
    }

    public String getNombre(){
        return nombre;
    }

    public int getTel(){
        return telefono;
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public ArrayList<Proveedor> getProveedores(){
        return proveedores;
    }

    public String toString(){
        return "\n Nombre: " + nombre + "\n Telefono: " + telefono;
    }
}
