package com.example.tareaparcial2;
import java.util.*;
import java.util.stream.Collectors;

public class UtileriaCadenas {
    public UtileriaCadenas(){};

    public static void filtroSelectivo(ArrayList<String> prueba2, char letra, int longitud){
        prueba2.removeIf(s-> s.length()<longitud||s.charAt(0)==letra);
    }

    public static ArrayList<String> conversorMayusculas(ArrayList<String>prueba3){
        return prueba3.stream().map(s -> s != null ? s.toUpperCase() : null).collect(Collectors.toCollection(ArrayList::new));
    }

    public static HashMap mapaLongitudes(ArrayList<String>prueba5){
        return prueba5.stream().collect(Collectors.toMap(s -> s, s -> s.length(), (existing, replacement) -> existing,HashMap::new));
    }

    public static void modificadorInventario(HashMap<String,Double> prueba6){
        prueba6.forEach((c,v)-> System.out.println(c+": $"+v*0.90));
    }

    public static HashMap<String,Integer> contadorFrecuencias(ArrayList<String>prueba7){
        HashMap<String, Integer> mapa = new HashMap<>();
        prueba7.forEach(palabra -> mapa.merge(palabra, 1, Integer::sum));
        return mapa;
    }

    public static ArrayList<String> ClasificadorCalificaciones(HashMap<String,Integer>prueba8, int minimo){
        return prueba8.entrySet().stream().filter(e -> e.getValue() < minimo).map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));
    }

    public static HashSet deduplicacionPalabras(String prueba9, int minimo){
        if (prueba9.isEmpty()) return new HashSet<>();
        return Arrays.stream(prueba9.split("[^a-zA-ZáéíóúÁÉÍÓÚ]+")).filter(s -> s.length() >= minimo).map(String::toLowerCase).collect(Collectors.toCollection(HashSet::new));
    }

    public static void topeFrecuencias(HashMap<String, Integer> prueba10, int minimo) {
        prueba10.replaceAll((palabra, frecuencia)->frecuencia>minimo?minimo:frecuencia);
    }
}
