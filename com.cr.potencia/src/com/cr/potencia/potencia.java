package com.cr.potencia;

public class potencia {

    public double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1; 
        } else if (exponente > 0) {
            return base * calcularPotencia(base, exponente - 1);
        } else {
            return 1 / calcularPotencia(base, -exponente); 
            }
    }
}
