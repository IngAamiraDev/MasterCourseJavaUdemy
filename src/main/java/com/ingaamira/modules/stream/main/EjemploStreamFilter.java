package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para filtrar objetos de tipo {@code Usuario}.
 * <p>
 * Se genera un flujo de nombres, se mapea a objetos {@code Usuario}, se filtran aquellos con nombre "Pepe"
 * y se recopilan en una lista utilizando {@code Collectors.toList()}.
 * Finalmente, se imprimen los resultados.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFilter {
    public static void main(String[] args) {

        // Crear un Stream de nombres y mapearlo a objetos Usuario
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia") // Flujo de nombres completos
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) // Convertir a Usuario
                .filter(u -> u.getNombre().equals("Pepe")) // Filtrar solo los usuarios cuyo nombre es "Pepe"
                .peek(System.out::println); // Imprimir cada usuario filtrado antes de recolectarlo

        // Convertir el Stream en una lista de usuarios
        List<Usuario> lista = nombres.collect(Collectors.toList());

        // Imprimir la lista de usuarios resultante
        lista.forEach(System.out::println);
    }
}