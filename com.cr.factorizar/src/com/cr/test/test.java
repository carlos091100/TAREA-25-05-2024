package com.cr.test;

import java.util.List;
import java.util.Scanner;

import com.cr.factorizar.factorizar;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El numero debe ser un entero positivo.");
            scanner.close();
            return;
        }

        factorizar factorizador = new factorizar();
        List<Integer> factoresPrimos = factorizador.descomponerEnFactoresPrimos(numero);

        System.out.println("Factores primos de " + numero + ": " + factoresPrimos);
        scanner.close();
    }
}
