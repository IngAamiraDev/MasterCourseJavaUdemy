package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Clase que demuestra la conversión de una lista de objetos {@code Usuario} a un {@code Stream}.
 * <p>
 * Se aplica un proceso de transformación donde:
 * - Se convierten los nombres y apellidos a mayúsculas.
 * - Se filtran solo los usuarios cuyo nombre contiene "Bruce".
 * - Se convierten los resultados a minúsculas.
 * - Se imprime cada resultado y se cuenta el número total de coincidencias.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamListToStream {
    public static void main(String[] args) {

        // Crear una lista de usuarios
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andrés", "Guzmán"));
        lista.add(new Usuario("Luci", "Martínez"));
        lista.add(new Usuario("Pepe", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        // Convertir la lista en un Stream y aplicar transformaciones
        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase())) // Convertir nombre completo a mayúsculas
                .flatMap(nombre -> {
                    if (nombre.contains("BRUCE")) { // Filtrar solo nombres que contengan "BRUCE"
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase) // Convertir el resultado a minúsculas
                .peek(System.out::println); // Imprimir cada nombre filtrado

        // Contar los nombres filtrados
        System.out.println("Total de coincidencias: " + nombres.count());
    }
}