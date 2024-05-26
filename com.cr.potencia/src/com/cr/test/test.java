package com.cr.test;

import java.util.Scanner;
import com.cr.potencia.potencia;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        potencia calculadora = new potencia();
        double potencia = calculadora.calcularPotencia(base, exponente);

        System.out.println(base + " elevado a la " + exponente + " potencia es: " + potencia);
        scanner.close();
    }
}
