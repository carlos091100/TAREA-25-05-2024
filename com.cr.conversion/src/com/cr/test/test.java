package com.cr.test;

import java.util.Scanner;

import com.cr.conversion.Conversor;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la unidad de origen:");
        System.out.println("1. Longitud (metros)");
        System.out.println("2. Masa (gramos)");
        System.out.println("3. Temperatura (Celsius)");

        int opcionUnidadOrigen = scanner.nextInt();

        System.out.println("Ingrese el valor a convertir:");
        double valorOrigen = scanner.nextDouble();

        System.out.println("Seleccione la unidad de destino:");
        System.out.println("1. Metros");
        System.out.println("2. Kilometros");
        System.out.println("3. Gramos");
        System.out.println("4. Kilogramos");
        System.out.println("5. Celsius");
        System.out.println("6. Fahrenheit");

        int opcionUnidadDestino = scanner.nextInt();

        Conversor conversor = new Conversor();
        double valorConvertido = conversor.convertirUnidad(opcionUnidadOrigen, valorOrigen, opcionUnidadDestino);

        System.out.println("El valor convertido es: " + valorConvertido);
        scanner.close();
    }
}

