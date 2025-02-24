package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de la operación {@code map} en un {@link Stream} para transformar
 * elementos y realizar operaciones intermedias.
 * <p>
 * En este ejemplo, se crea un {@code Stream} de nombres completos, se transforma en un
 * {@code Stream} de objetos {@link Usuario}, y luego se modifica el nombre de cada usuario
 * convirtiéndolo a mayúsculas. Finalmente, se recopilan los resultados en una lista.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamMap {

    /**
     * Método principal que ejecuta las operaciones con {@code Stream}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Crear un Stream de nombres completos
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                // Transformar cada nombre completo en un objeto Usuario
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                // Operación intermedia para imprimir cada usuario creado
                .peek(System.out::println)
                // Transformar el nombre de cada usuario a mayúsculas
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        // Recopilar los usuarios transformados en una lista
        List<Usuario> lista = nombres.collect(Collectors.toList());

        // Imprimir cada usuario de la lista
        lista.forEach(System.out::println);
    }
}