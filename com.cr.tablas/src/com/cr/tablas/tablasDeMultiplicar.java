package com.cr.tablas;

public class tablasDeMultiplicar {

    public static void mostrarTabla(int numero) {
        if (numero <= 0) {
            System.out.println("El numero debe de ser mayor que cero.");
            return;
        }

        System.out.println("Tabla del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
