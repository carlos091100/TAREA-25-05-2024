package com.cr.test;

import java.util.Scanner;
import com.cr.factorial.Factorial;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        int factorial = Factorial.factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
        
        scanner.close();
    }
}
