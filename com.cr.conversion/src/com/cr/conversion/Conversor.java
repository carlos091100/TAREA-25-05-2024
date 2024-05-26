package com.cr.conversion; 

public class Conversor {

    public double convertirUnidad(int unidadOrigen, double valorOrigen, int unidadDestino) {
        switch (unidadOrigen) {
            case 1: // Longitud (metros)
                switch (unidadDestino) {
                    case 1: // Metros
                        return valorOrigen;
                    case 2: // Kilómetros
                        return valorOrigen / 1000;
                    default:
                        return 0;
                }
            case 2: // Masa (gramos)
                switch (unidadDestino) {
                    case 3: // Gramos
                        return valorOrigen;
                    case 4: // Kilogramos
                        return valorOrigen / 1000;
                    default:
                        return 0;
                }
            case 3: // Temperatura (Celsius)
                switch (unidadDestino) {
                    case 5: // Celsius
                        return valorOrigen;
                    case 6: // Fahrenheit
                        return (valorOrigen * 9 / 5) + 32;
                    default:
                        return 0;
                }
            default:
                return 0;
        }
    }
}
