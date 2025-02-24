package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para eliminar duplicados de objetos {@code Usuario}.
 * <p>
 * Se genera un flujo de nombres, se mapea a objetos {@code Usuario}, y se aplica {@code distinct()}
 * para eliminar duplicados basados en la implementación de {@code equals()} y {@code hashCode()} en la clase {@code Usuario}.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        // Crear un Stream de nombres con algunos repetidos
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman") // "Pato Guzman" está repetido
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) // Convertir a Usuario
                .distinct(); // Eliminar duplicados basándose en equals() y hashCode()

        // Imprimir los usuarios únicos
        nombres.forEach(System.out::println);
    }
}