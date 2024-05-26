package com.cr.test;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos numeros desea ingresar?: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];


        System.out.println("Ingrese los numeros:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }

 
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < cantidad; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }


        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        
        scanner.close();
    }
}
