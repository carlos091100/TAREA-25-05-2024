package com.cr.test;

import java.util.Scanner;

public class test {

  public static void main(String[] args) {
 
	Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    int numero = scanner.nextInt();

    boolean esPrimo = com.cr.primo.Proyecto.esPrimo(numero);
    String mensaje = (esPrimo) ? numero + " es un numero primo" : numero + " no es un numero primo";
    System.out.println(mensaje);
    
    scanner.close();
  }
}
