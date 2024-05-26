package com.cr.promedio;

import java.util.List;

public class Promedio {
	public static double listaPromedio(List<Double> numeros) {
		double suma = 0.0;
		for (double numero : numeros) {
            suma += numero;
		}
		return suma/ numeros.size();
	}
}
