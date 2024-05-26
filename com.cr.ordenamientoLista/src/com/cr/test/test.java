package com.cr.test;

import java.util.Scanner;

import com.cr.ordenamientoLista.ordenamientoLista;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantos numeros desea ingresar?: ");
        int cantidad = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese " + cantidad + " numeros:");
        for (int i = 0; i < cantidad; i++) {
            numeros.add(scanner.nextInt());
        }

        ordenamientoLista ordenador = new ordenamientoLista();
        List<Integer> numerosOrdenados = ordenador.ordenarAscendente(numeros);

        System.out.println("Numeros ordenados de menor a mayor:");
        for (Integer numero : numerosOrdenados) {
            System.out.print(numero + " ");
            scanner.close();
        }
    }
}
