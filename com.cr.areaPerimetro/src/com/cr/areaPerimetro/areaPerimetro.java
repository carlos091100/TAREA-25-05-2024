package com.cr.areaPerimetro;

public class areaPerimetro {

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Method for equilateral triangle (all sides equal)
    public double calcularPerimetroTrianguloEquilatero(double lado) {
        return 3 * lado;
    }
    
    public double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;

    }

}
