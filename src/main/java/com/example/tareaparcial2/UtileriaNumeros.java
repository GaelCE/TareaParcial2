package com.example.tareaparcial2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UtileriaNumeros {
    public UtileriaNumeros(){}

    public static void multiplicador(ArrayList <Integer> prueba, int factor){
        prueba.replaceAll(n->n*factor);
    }

    public static HashSet cuadradosUnicos(ArrayList<Integer>ejercicio4){
        return ejercicio4.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toCollection(HashSet::new));
    }

}
