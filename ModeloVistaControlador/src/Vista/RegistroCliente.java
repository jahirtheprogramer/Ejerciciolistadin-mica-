/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class RegistroCliente {
  private String colorBoton;
  private int numBoton;
  private int numLabel;
  private String colorLabel;
  private String colorFormulario;
  private Scanner teclado;   
 

//SE CREA EL CONSTRUCOR
 public RegistroCliente(){
  this.colorBoton="rojo";
  this.colorFormulario="blanco";
  this.colorLabel= "amarrillo";
  this.numBoton=5;
  this.numLabel=10;
}
public int mostrarMenu(){
    System.out.println("1. Registrar cliente");
    System.out.println("2. ver lista de clientes");
    System.out.println("3. salir");
    this.teclado= new Scanner(System.in);
    System.out.println("seleccione una opcion.....");
   int OpcionMenu = teclado.nextInt();
   return OpcionMenu;
}

public String tomarRegistro_cliente(){
 this.teclado= new Scanner(System.in);
    System.out.println("Bienvenido al sistema");
    System.out.println("Digite el nombre del cliente");
    String nombreCliente = teclado.nextLine();
    System.out.println("digite el apellido del cliente");
    String apellidoCliente= teclado.nextLine();
    System.out.println("digite la cedula del cliente: ");
   String cedulaCliente = teclado.nextLine();
   return nombreCliente;
}





}
