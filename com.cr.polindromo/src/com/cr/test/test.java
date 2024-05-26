package com.cr.test;

import java.util.Scanner;
import com.cr.polindromo.Palindromo;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        Palindromo detector = new Palindromo();
        boolean esPalindromo = detector.esPalindromo(palabra);

        if (esPalindromo) {
            System.out.println(palabra + " es un palindromo.");
        } else {
            System.out.println(palabra + " no es un palindromo.");
            scanner.close();
        }
    }
}
