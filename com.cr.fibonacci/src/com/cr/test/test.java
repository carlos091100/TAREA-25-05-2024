package com.cr.test;

import com.cr.fibonacci.Fibonacci;

public class test {

    public static void main(String[] args) {
        int n = 10; 

        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci.calcularFibonacci(i) + " ");
        }
    }
}
