package com.cr.test;

import java.util.Scanner;

import com.cr.inversor.inversor;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        inversor Inversor = new  inversor();
        int numeroInvertido = Inversor.invertirNumero(numero);

        System.out.println("El numero invertido de " + numero + " es: " + numeroInvertido);
        scanner.close();
    }
}
