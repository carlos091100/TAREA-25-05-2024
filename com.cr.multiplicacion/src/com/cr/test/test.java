package com.cr.test;

import java.util.Scanner;

import com.cr.multiplicacion.Multiplicacion;

public class test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese el primer numero: ");
		int numero11 = scanner.nextInt();
		
		System.out.println("ingrese el segundo numero: ");
		int numero22 = scanner.nextInt();
		
		int producto = Multiplicacion.multiplicador(numero11,numero22);
		
		System.out.println("la multiplicacion es de: "+ producto);
	
	    scanner.close();
	}

}
