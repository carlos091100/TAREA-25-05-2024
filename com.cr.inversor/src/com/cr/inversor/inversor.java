package com.cr.inversor;

public class inversor {

    public int invertirNumero(int numero) {
        int invertido = 0;
        int resto;

        for (; numero != 0; numero /= 10) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
        }

        return invertido;
    }
}
