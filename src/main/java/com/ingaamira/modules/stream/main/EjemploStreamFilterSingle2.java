package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para filtrar y obtener un objeto {@code Usuario}.
 * <p>
 * Se crea un flujo de nombres, se convierten en objetos {@code Usuario},
 * se filtran por ID y se obtiene el primer resultado disponible o un usuario por defecto.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        // Crear un Stream de nombres y mapearlos a objetos Usuario
        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) // Separar nombre y apellido
                .peek(System.out::println) // Imprimir cada usuario generado
                .filter(u -> u.getId().equals(4)) // Filtrar usuario con ID 4
                .findFirst().orElseGet(() -> new Usuario("John", "Doe")); // Retornar usuario por defecto si no se encuentra

        System.out.println(usuario); // Imprimir el usuario obtenido
    }
}
