package com.cr.text; 

public class Main {

  public static void main(String[] args) {

    int[] numeros = new int[5];

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Ingrese el número " + (i + 1) + ": ");
      Scanner scanner = new Scanner(System.in);
      numeros[i] = scanner.nextInt();
    }

    FindMinMax.encontrarMaxMin(numeros); // Calling the method from FindMinMax class
  }
}
