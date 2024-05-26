package com.cr.polindromo;

public class Palindromo {

    public boolean esPalindromo(String palabra) {
        palabra = palabra.replaceAll("\\s", ""); 
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
