package com.cr.fibonacci;

public class Fibonacci {

    public static int calcularFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
