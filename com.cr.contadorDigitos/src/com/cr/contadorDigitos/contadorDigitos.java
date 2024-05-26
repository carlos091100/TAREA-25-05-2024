package com.cr.contadorDigitos;

public class contadorDigitos {

    public int contarDigitos(int numero) {
        int contador = 0;

        for (; numero != 0; numero /= 10) {
            contador++;
        }

        return contador;
    }
}
