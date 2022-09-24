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
            client.setTel(input.nextInt());

            for (Empresa e : empresas){
                if(e.getNombre().equals(compannia.getNombre())){
                    e.agregarCliente(client);
                }else{
                    empresas.add(compannia);
                    compannia.agregarCliente(client);
                }
            }
        }

        Persona.clientes.add(client);
        System.out.println("Cliente agregado \n");
        System.out.println(client.toString());

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
                //insertarEmpleado();
                break;

                case 4:
                //insertarProveedor();
                break;

                case 5:
                //mostrarTodo();
                break;

                case 6:
                //mostrarClientes();

                case 7:
                //mostrarProveedores();
                
                case 8:
                System.out.println("Saliendo del sistema...");
                entrada.close();
            }
        }while(opcion != 8);
    }
}
