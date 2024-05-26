package com.cr.factorizar;

import java.util.ArrayList;
import java.util.List;

public class factorizar {

    public List<Integer> descomponerEnFactoresPrimos(int numero) {
        List<Integer> factoresPrimos = new ArrayList<>();

        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) { // Usar la raíz cuadrada como límite
            for (; numero % divisor == 0; numero /= divisor) {
                factoresPrimos.add(divisor);
            }
        }

        if (numero > 1) {
            factoresPrimos.add(numero);
        }

        return factoresPrimos;
    }
}
