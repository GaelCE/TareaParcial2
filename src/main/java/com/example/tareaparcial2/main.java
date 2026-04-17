package com.example.tareaparcial2;
import java.util.*;

public class main {

    static void main(String[] args) {
        System.out.println("Ejercicio 1 - Multiplicar por factor");
        ArrayList<Integer> ejercicio1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) ejercicio1.add(i);
        System.out.println("Lista original: " + ejercicio1);
        UtileriaNumeros.multiplicador(ejercicio1, 4);
        System.out.println("Multiplicada por 4: " + ejercicio1);
        System.out.println("(edge) factor 0, todos los valores se van a 0:");
        ArrayList<Integer> edge1 = new ArrayList<>(Arrays.asList(3, 7, 12));
        System.out.println("  antes:  " + edge1);
        UtileriaNumeros.multiplicador(edge1, 0);
        System.out.println("  despues: " + edge1);
        System.out.println();

        System.out.println("Ejercicio 2 - Filtrar selectivamente");
        ArrayList<String> ejercicio2 = new ArrayList<>();
        ejercicio2.add("Casa"); ejercicio2.add("Caleidoscopio");
        ejercicio2.add("Coche"); ejercicio2.add("Zebra");
        ejercicio2.add("Mariposa"); ejercicio2.add("Mesa");
        System.out.println("Lista original: " + ejercicio2);
        UtileriaCadenas.filtroSelectivo(ejercicio2, 'C', 5);
        System.out.println("Filtrada (quita <5 letras o empieza con C): " + ejercicio2);
        System.out.println("(edge) todas empiezan con 'a' y tienen menos de 5 letras, lista queda vacia:");
        ArrayList<String> edge2 = new ArrayList<>(Arrays.asList("ala", "ar", "ave"));
        System.out.println("  antes:  " + edge2);
        UtileriaCadenas.filtroSelectivo(edge2, 'a', 5);
        System.out.println("  despues: " + edge2);
        System.out.println();

        System.out.println("Ejercicio 3 - Convertir a mayusculas");
        ArrayList<String> ejercicio3 = new ArrayList<>();
        ejercicio3.add("hola"); ejercicio3.add("mundo");
        ejercicio3.add("mesa"); ejercicio3.add("asdf");
        System.out.println("Lista original: " + ejercicio3);
        System.out.println("En mayusculas: " + UtileriaCadenas.conversorMayusculas(ejercicio3));
        System.out.println("(edge) lista vacia, no hay nada que convertir:");
        ArrayList<String> edge3 = new ArrayList<>();
        System.out.println("  antes:  " + edge3);
        System.out.println("  despues: " + UtileriaCadenas.conversorMayusculas(edge3));
        System.out.println();

        System.out.println("Ejercicio 4 - Cuadrado de numeros pares unicos");
        ArrayList<Integer> ejercicio4 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) ejercicio4.add(random.nextInt(10) + 1);
        System.out.println("Lista original: " + ejercicio4);
        System.out.println("Pares unicos al cuadrado: " + UtileriaNumeros.cuadradosUnicos(ejercicio4));
        System.out.println("(edge) solo numeros impares, el filtro elimina todo:");
        ArrayList<Integer> edge4 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        System.out.println("  antes:  " + edge4);
        System.out.println("  despues: " + UtileriaNumeros.cuadradosUnicos(edge4));
        System.out.println();

        System.out.println("Ejercicio 5 - Mapear longitudes");
        ArrayList<String> ejercicio5 = new ArrayList<>();
        ejercicio5.add("Teclado"); ejercicio5.add("Caja");
        ejercicio5.add("Telefono"); ejercicio5.add("Mouse");
        System.out.println("Lista original: " + ejercicio5);
        System.out.println("Mapa palabra->longitud: " + UtileriaCadenas.mapaLongitudes(ejercicio5));
        System.out.println("(edge) todas tienen la misma longitud, valores distintos misma longitud:");
        ArrayList<String> edge5 = new ArrayList<>(Arrays.asList("sol", "mar", "rio"));
        System.out.println("  antes:  " + edge5);
        System.out.println("  despues: " + UtileriaCadenas.mapaLongitudes(edge5));
        System.out.println();

        System.out.println("Ejercicio 6 - Inventario con descuento");
        HashMap<String, Double> ejercicio6 = new HashMap<>();
        ejercicio6.put("Teclado", 100.0); ejercicio6.put("Mouse", 50.0);
        ejercicio6.put("Laptop", 1000.0); ejercicio6.put("Monitor", 150.0);
        System.out.println("Inventario: " + ejercicio6);
        System.out.println("Precios con 10% de descuento:");
        UtileriaCadenas.modificadorInventario(ejercicio6);
        System.out.println("(edge) inventario vacio, forEach no itera y no imprime nada:");
        HashMap<String, Double> edge6 = new HashMap<>();
        System.out.println("  inventario: " + edge6);
        System.out.println("  salida del metodo: (ninguna)");
        UtileriaCadenas.modificadorInventario(edge6);
        System.out.println();

        System.out.println("Ejercicio 7 - Contar frecuencias");
        ArrayList<String> ejercicio7 = new ArrayList<>();
        ejercicio7.add("gato"); ejercicio7.add("perro"); ejercicio7.add("raton");
        ejercicio7.add("perro"); ejercicio7.add("perro"); ejercicio7.add("gato");
        ejercicio7.add("perro"); ejercicio7.add("perro"); ejercicio7.add("perro");
        ejercicio7.add("perro"); ejercicio7.add("perro"); ejercicio7.add("perro");
        ejercicio7.add("gato"); ejercicio7.add("gato"); ejercicio7.add("gato");
        ejercicio7.add("gato"); ejercicio7.add("gato"); ejercicio7.add("paloma");
        ejercicio7.add("paloma"); ejercicio7.add("paloma"); ejercicio7.add("paloma");
        ejercicio7.add("paloma"); ejercicio7.add("paloma");
        System.out.println("Lista: " + ejercicio7);
        System.out.println("Frecuencias: " + UtileriaCadenas.contadorFrecuencias(ejercicio7));
        System.out.println("(edge) una sola palabra repetida, debe acumular correctamente:");
        ArrayList<String> edge7 = new ArrayList<>(Arrays.asList("abeja", "abeja", "abeja"));
        System.out.println("  antes:  " + edge7);
        System.out.println("  despues: " + UtileriaCadenas.contadorFrecuencias(edge7));
        System.out.println();

        System.out.println("Ejercicio 8 - Clasificar palabras por frecuencia");
        HashMap<String, Integer> ejercicio8 = UtileriaCadenas.contadorFrecuencias(ejercicio7);
        System.out.println("Frecuencias: " + ejercicio8);
        System.out.println("Palabras con frecuencia menor a 7: " + UtileriaCadenas.ClasificadorCalificaciones(ejercicio8, 7));
        System.out.println("(edge) minimo muy alto, todas las palabras califican:");
        HashMap<String, Integer> edge8 = new HashMap<>();
        edge8.put("hola", 2); edge8.put("mundo", 4);
        System.out.println("  frecuencias: " + edge8);
        System.out.println("  clasificadas (<99): " + UtileriaCadenas.ClasificadorCalificaciones(edge8, 99));
        System.out.println();

        System.out.println("Ejercicio 9 - Deduplicar palabras");
        String ejercicio9 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas ultricies purus ut neque ornare, id tristique";
        System.out.println("Texto: " + ejercicio9);
        System.out.println("Palabras unicas con 6+ letras: " + UtileriaCadenas.deduplicacionPalabras(ejercicio9, 6));
        System.out.println("(edge) palabras cortas y repetidas, el filtro elimina todo:");
        String edge9 = "el el la la un un";
        System.out.println("  texto:   " + edge9);
        System.out.println("  despues: " + UtileriaCadenas.deduplicacionPalabras(edge9, 5));
        System.out.println();

        System.out.println("Ejercicio 10 - Limitar frecuencias");
        HashMap<String, Integer> ejercicio10 = UtileriaCadenas.contadorFrecuencias(ejercicio7);
        System.out.println("Frecuencias originales: " + ejercicio10);
        UtileriaCadenas.topeFrecuencias(ejercicio10, 5);
        System.out.println("Con limite de 5: " + ejercicio10);
        System.out.println("(edge) limite mayor que todas las frecuencias, nada cambia:");
        HashMap<String, Integer> edge10 = new HashMap<>();
        edge10.put("gato", 3); edge10.put("perro", 7);
        System.out.println("  antes:  " + edge10);
        UtileriaCadenas.topeFrecuencias(edge10, 100);
        System.out.println("  despues: " + edge10);
    }
}