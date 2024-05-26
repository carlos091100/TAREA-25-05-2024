package com.cr.test;

import java.util.Scanner;
import com.cr.contadorDigitos.contadorDigitos;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        contadorDigitos contador = new contadorDigitos();
        int cantidadDigitos = contador.contarDigitos(numero);

        System.out.println("El numero " + numero + " tiene " + cantidadDigitos + " digitos.");
        scanner.close();
    }
}
