package com.cr.test;

import java.util.Scanner;

import com.cr.areaPerimetro.areaPerimetro;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seleccione la figura geometrica:\n" +
                "1. Circulo\n" +
                "2. Cuadrado\n" +
                "3. Triangulo\n" +
                "4. Rectangulo\n" +
                "0. Salir\n" +
                "Opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularCuadrado(scanner);
                break;
            case 3:
                calcularTriangulo(scanner);
                break;
            case 4:
                calcularRectangulo(scanner);
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        areaPerimetro figuras = new areaPerimetro();
        double area = figuras.calcularAreaCirculo(radio);
        double perimetro = figuras.calcularPerimetroCirculo(radio);

        System.out.println("Area del circulo: " + area);
        System.out.println("Perimetro del circulo: " + perimetro);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        areaPerimetro figuras = new areaPerimetro();
        double area = figuras.calcularAreaCuadrado(lado);
        double perimetro = figuras.calcularPerimetroCuadrado(lado);

        System.out.println("Area del cuadrado: " + area);
        System.out.println("Perimetro del cuadrado: " + perimetro);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del trangulo: ");
        double altura = scanner.nextDouble();

        areaPerimetro figuras = new areaPerimetro();
        double area = figuras.calcularAreaTriangulo(base, altura);
        double perimetro = figuras.calcularAreaTriangulo(base, altura);

        System.out.println("Area del triangulo: " + area);
        System.out.println("Perimetro del triangulo: " + perimetro);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        areaPerimetro figuras = new areaPerimetro();
        double area = figuras.calcularAreaRectangulo(base, altura);
        double perimetro = figuras.calcularPerimetroRectangulo(base, altura);

        System.out.println("Área del rectangulo: " + area);
        System.out.println("Perímetro del rectangulo: " + perimetro);
        scanner.close();
    }
}
