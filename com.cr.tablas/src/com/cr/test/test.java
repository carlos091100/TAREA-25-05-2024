package com.cr.test;

import java.util.Scanner;

import com.cr.tablas.tablasDeMultiplicar;

public class test {

    public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de la tabla que quiere conocer : ");
        int numero = scanner.nextInt();

        tablasDeMultiplicar.mostrarTabla(numero);
        
        scanner.close();
    }
}
