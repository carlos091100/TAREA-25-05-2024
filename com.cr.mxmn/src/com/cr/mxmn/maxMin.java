package com.cr.mxmn;

public class maxMin {

    public static int[] encontrarMayorMenor(int[] lista) {
        int mayor = lista[0];
        int menor = lista[0];

        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            } else if (lista[i] < menor) {
                menor = lista[i];
            }
        }

        return new int[]{mayor, menor};
    }
}
