package com.cr.ordenamientoLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenamientoLista {

    public List<Integer> ordenarAscendente(List<Integer> numeros) {
      
        List<Integer> numerosOrdenar = new ArrayList<>(numeros);

        
        Collections.sort(numerosOrdenar);

        return numerosOrdenar;
    }
}
