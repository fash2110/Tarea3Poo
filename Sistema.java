package Tarea3;

import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class Sistema {
    public static void insertarCliente(ArrayList<Empresa> empresas){
        Scanner entrada = new Scanner(System.in);
        Cliente client = new Cliente();
        
        System.out.print("Ingrese el nombre del cliente: ");
        client.setNombre(entrada.nextLine());
        System.out.print("Nombre agregado \n Ingrese la direccion del cliente: ");
        client.setDir(entrada.nextLine());
        System.out.print("Direccion \n Ingrese el correo del cliente: ");
        client.setCorreo(entrada.nextLine());
        System.out.print("Correo agregado \n Ingrese la identificacion del cliente: ");
        client.setId(entrada.nextInt());
        System.out.print("Identificacion agregada \n Ingrese el telefono del cliente: ");
        client.setTel(entrada.nextInt());
        System.out.print("Telefono agregado \n Ingrese el limite de credito del cliente: ");
        client.setLimite(entrada.nextInt());
        client.setFecha(java.time.LocalDate.now().toString());

        System.out.println("Es este cliente parte de una empresa? \n 1. Si \n 2. No");
        if(entrada.nextInt() == 1){
            Empresa compannia = new Empresa();
            Scanner input = new Scanner(System.in);
            System.out.print("Ingrese el nombre de la empresa: ");            
            compannia.setNombre(input.nextLine());
            System.out.print("Ingrese el telefono de la empresa: ");
            compannia.setTel(input.nextInt());

            for (Empresa empresa : empresas) {
                if(empresa.getNombre().equals(compannia.getNombre())){
                    empresa.agregarCliente(client);
                    System.out.println("Cliente agregado a la empresa");
                    return;
                }
            }
            compannia.agregarCliente(client);
            empresas.add(compannia);
            System.out.println("Cliente agregado a la empresa");
        }else{
            Persona.AgregarCliente(client);
            System.out.println("Cliente agregado \n");
            System.out.println(client.toString());
        }

    }

    public static void modificarCliente(){
        Scanner entrada = new Scanner(System.in);
        Cliente client = new Cliente();
        System.out.print("Ingrese la identificacion del cliente a modificar: ");
        for (Cliente c : Persona.clientes){
            if(c.getId() == entrada.nextInt()){
                Scanner in = new Scanner(System.in);
                System.out.print("Ingrese el nombre del cliente: ");
                c.setNombre(in.nextLine());
                System.out.print("\n Ingrese la direccion del cliente: ");
                c.setDir(in.nextLine());
                System.out.print("\n Ingrese el correo del cliente: ");
                c.setCorreo(in.nextLine());
                System.out.print("\n Ingrese el telefono del cliente: ");
                c.setTel(in.nextInt());
                System.out.print("\n Ingrese el limite de credito del cliente: ");
                c.setLimite(in.nextInt());

                System.out.println("Cliente modificado con exito");
                System.out.println(c.toString());
                return;
            }
        }
        System.out.println("No se encontro el cliente");
    }

    public static void registarEmpleado(){
        Scanner entrada = new Scanner(System.in);
        Empleado emp = new Empleado();
        System.out.print("Ingrese el nombre del empleado: ");
        emp.setNombre(entrada.nextLine());
        System.out.print("Ingrese la identificacion del empleado: ");
        emp.setId(entrada.nextInt());
        System.out.print("Ingrese el correo del empleado: ");
        emp.setCorreo(entrada.nextLine());
        System.out.print("Ingrese la direccion del empleado: ");
        emp.setDir(entrada.nextLine());
        System.out.print("Ingrese el telefono del empleado: ");
        emp.setTel(entrada.nextInt());
        System.out.print("Ingrese el salario del empleado: ");
        emp.setSalario(entrada.nextInt());
        emp.setFecha(java.time.LocalDate.now().toString());

        Persona.AgregarEmpleado(emp);
        System.out.println("Empleado agregado \n");
        System.out.println(emp.toString());
    }

    public static void registrarProveedor(ArrayList<Empresa> empresas){
        Scanner entrada = new Scanner(System.in);
        Proveedor prov = new Proveedor();
        System.out.print("Ingrese el nombre del proveedor: ");
        prov.setNombre(entrada.nextLine());
        System.out.print("Ingrese la identificacion del proveedor: ");
        prov.setId(entrada.nextInt());
        System.out.print("Ingrese el correo del proveedor: ");
        prov.setCorreo(entrada.nextLine());
        System.out.print("Ingrese la direccion del proveedor: ");
        prov.setDir(entrada.nextLine());
        System.out.print("Ingrese el telefono del proveedor: ");
        prov.setTel(entrada.nextInt());
        prov.setFecha(java.time.LocalDate.now().toString());

        System.out.println("Es este proveedor parte de una empresa? \n 1. Si \n 2. No");
        if(entrada.nextInt() == 1){
            Empresa compannia = new Empresa();
            Scanner input = new Scanner(System.in);
            System.out.print("Ingrese el nombre de la empresa: ");            
            compannia.setNombre(input.nextLine());
            System.out.print("Ingrese el telefono de la empresa: ");
            compannia.setTel(input.nextInt());

            for (Empresa empresa : empresas) {
                if(empresa.getNombre().equals(compannia.getNombre())){
                    empresa.agregarProveedor(prov);
                    System.out.println("Proveedor agregado a la empresa");
                    return;
                }
            }
            compannia.agregarProveedor(prov);
            empresas.add(compannia);
            System.out.println("Proveedor agregado a la empresa");
        }else{
            Persona.agregarProveedor(prov);
            System.out.println("Proveedor agregado \n");
            System.out.println(prov.toString());
        }
    }

    public static void mostrarDatos(ArrayList<Empresa> empresas){
        System.out.println("Clientes: ");
        for (Cliente c : Persona.clientes){
            System.out.println(c.toString());
        }
        for (Empresa e : empresas){
            for (Cliente c : e.getClientes()){
                System.out.println(c.toString());
            }
        }
        System.out.println("---------------\n");
        System.out.println("Empleados: ");
        for (Empleado e : Persona.empleados){
            System.out.println(e.toString());
        }
        System.out.println("---------------\n");
        System.out.println("Proveedores: ");
        for (Proveedor p : Persona.proveedores){
            System.out.println(p.toString());
        }
        for (Empresa e : empresas){
            for (Proveedor p : e.getProveedores()){
                System.out.println(p.toString());
            }
        }
        System.out.println("---------------\n");
    }

    public static void mostrarClientesEmpresa(ArrayList<Empresa> empresas){
        int cont = 0;
        for (Empresa e : empresas){
            cont += e.getClientes().size();
        }
        System.out.println("Clientes que pertenecen a una empresa: " + cont);
        System.out.println("Clientes que no pertenecen a una empresa: " + (Persona.getClientes.size()));
    }

    public static void mostrarProveedoresEmpresa(ArrayList<Empresa> empresas){
        int cont = 0;
        for (Empresa e : empresas){
            cont += e.getProveedores().size();
        }
        System.out.println("Proveedores que pertenecen a una empresa: " + cont);
        System.out.println("Proveedores que no pertenecen a una empresa: " + (Persona.getProveedores.size()));
    }

    public static void main(String[] args){
        Cliente cliente0 = new Cliente();
        Proveedor proveedor0 = new Proveedor();
        Empleado empleado0 = new Empleado();
        ArrayList<Empresa> empresas = new ArrayList<Empresa>();

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.print("\n --- Menu Principal --- \n " 
                + "1. Registrar Cliente \n " 
                + "2. Modificar Cliente \n " 
                + "3. Registrar Empleado \n " 
                + "4. Registrar proveedor \n "
                + "5. Mostrar todo \n" 
                + "6. Mostrar clientes separado por empresa \n"
                + "7. Mostrar proveedores separado por empresa \n"
                + "8. Salir \n"
                + "Ingrese una opcion: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                insertarCliente(empresas);
                break;

                case 2:
                modificarCliente();
                break;

                case 3:
                registarEmpleado();
                break;

                case 4:
                registrarProveedor(empresas);
                break;

                case 5:
                mostrarDatos(empresas);
                break;

                case 6:
                mostrarClientesEmpresa(empresas);
                break;

                case 7:
                mostrarProveedoresEmpresa(empresas);
                break;
                
                case 8:
                System.out.println("Saliendo del sistema...");
                entrada.close();
            }
        }while(opcion != 8);
    }
}
