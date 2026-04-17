Tarea Parcial 2

Proyecto para la materia de programación orietada a objetos. La idea es resolver cada uno de los 10 ejercicios que se encuentra en las instrucciones usando los tips que da cada uno de los ejercicios.

¿Qué hace el proyecto?

Se implementaron 10 métodos repartidos en dos clases: UtileriaNumeros para operaciones numéricas y UtileriaCadenas para manejo de texto. Cada método se prueba en la clase `main` con un caso normal y un caso edge.

## Los 10 métodos

**UtileriaNumeros**

multiplicador — recibe una lista de enteros y un factor, multiplica cada elemento por ese factor directo sobre la lista original.
cuadradosUnicos — filtra los pares, quita repetidos y regresa un HashSet con cada número elevado al cuadrado.

**UtileriaCadenas**

filtroSelectivo — borra de la lista las palabras que empiecen con cierta letra o que sean muy cortas (menos de N letras).
conversorMayusculas — regresa una lista nueva con todas las palabras en mayúsculas, sin tocar la original.
mapaLongitudes — construye un mapa donde cada palabra apunta a su longitud.
modificadorInventario — imprime los productos de un inventario con 10% de descuento aplicado, sin modificar el mapa.
contadorFrecuencias — cuenta cuántas veces aparece cada palabra en una lista y lo regresa en un mapa.
ClasificadorCalificaciones — filtra las entradas de un mapa de frecuencias y regresa solo las que estén por debajo de un umbral.
deduplicacionPalabras — toma una frase, separa las palabras, filtra las cortas, las pasa a minúsculas y elimina duplicados.
topePrecios — limita los valores de un mapa a un máximo, si ya estaban abajo los deja igual.

---

## Cómo correrlo

Necesitas tener Java 11 o más reciente. Si usas Android Studio o IntelliJ solo abres el proyecto y le das run al main.
## Ejemplo de salida

Ejercicio 1 - Multiplicar por factor
Lista original: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Multiplicada por 4: [0, 4, 8, 12, 16, 20, 24, 28, 32, 36]
(edge) factor 0, todos los valores se van a 0:
  antes:  [3, 7, 12]
  despues: [0, 0, 0]

Ejercicio 2 - Filtrar selectivamente
Lista original: [Casa, Caleidoscopio, Coche, Zebra, Mariposa, Mesa]
Filtrada (quita <5 letras o empieza con C): [Mariposa]
(edge) todas empiezan con 'a' y tienen menos de 5 letras, lista queda vacia:
  antes:  [ala, ar, ave]
  despues: []

Ejercicio 3 - Convertir a mayusculas
Lista original: [hola, mundo, mesa, asdf]
En mayusculas: [HOLA, MUNDO, MESA, ASDF]
(edge) lista vacia, no hay nada que convertir:
  antes:  []
  despues: []

Ejercicio 4 - Cuadrado de numeros pares unicos
Lista original: [3, 6, 2, 8, 6, 1, 4, 2, 9, 7, 4, 5, 8, 3, 10]
Pares unicos al cuadrado: [36, 4, 64, 16, 100]
(edge) solo numeros impares, el filtro elimina todo:
  antes:  [1, 3, 5, 7, 9]
  despues: []

Ejercicio 5 - Mapear longitudes
Lista original: [Teclado, Caja, Telefono, Mouse]
Mapa palabra->longitud: {Teclado=7, Caja=4, Telefono=8, Mouse=5}
(edge) todas tienen la misma longitud:
  antes:  [sol, mar, rio]
  despues: {sol=3, mar=3, rio=3}

Ejercicio 6 - Inventario con descuento
Inventario: {Teclado=100.0, Mouse=50.0, Laptop=1000.0, Monitor=150.0}
Teclado--90.0
Mouse--45.0
Laptop--900.0
Monitor--135.0
(edge) inventario vacio:
  salida del metodo: (ninguna)

Ejercicio 7 - Contar frecuencias
Frecuencias: {gato=6, perro=8, raton=1, paloma=6}

Ejercicio 8 - Clasificar palabras por frecuencia
Palabras con frecuencia menor a 7: [raton=1, gato=6, paloma=6]
(edge) minimo muy alto, todas califican:
  clasificadas (<99): [hola=2, mundo=4]

Ejercicio 9 - Deduplicar palabras
Palabras unicas con 6+ letras: [lorem, ipsum, dolor, consectetur, adipiscing, maecenas, ultricies, purus, ornare, tristique]
(edge) palabras cortas y repetidas, queda vacio:
  despues: []

Ejercicio 10 - Limitar frecuencias
Frecuencias originales: {gato=6, perro=8, raton=1, paloma=6}
Con limite de 5: {gato=5, perro=5, raton=1, paloma=5}
(edge) limite mayor que todas, nada cambia:
  antes:  {gato=3, perro=7}
  despues: {gato=3, perro=7}
