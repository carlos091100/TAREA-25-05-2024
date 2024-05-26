package com.cr.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cr.promedio.Promedio;

public class Test {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("ingrese la cantidad de numeros: ");
		int cantidadNumeros = scanner.nextInt();
		
		List<Double> numeros = new ArrayList<>();
		for (int i = 0; i < cantidadNumeros; i++) {
			double numero = scanner.nextDouble();
			numeros.add(numero);
		}
		double promedio = Promedio.listaPromedio(numeros);
        System.out.println("El promedio de los numeros es: " + promedio);
        
        scanner.close();
	}

}
