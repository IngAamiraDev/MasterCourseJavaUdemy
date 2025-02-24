package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de la operación {@code flatMap} en un {@link Stream} para
 * filtrar y transformar elementos de manera dinámica.
 * <p>
 * En este ejemplo, se crea un {@code Stream} de nombres completos, se transforma en un
 * {@code Stream} de objetos {@link Usuario}, y luego se utiliza {@code flatMap} para
 * filtrar solo los usuarios cuyo nombre es "Pepe". Finalmente, se cuenta la cantidad
 * de elementos en el {@code Stream} resultante.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFlatMap {

    /**
     * Método principal que ejecuta las operaciones con {@code Stream}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Crear un Stream de nombres completos
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                // Transformar cada nombre completo en un objeto Usuario
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                // Filtrar y transformar dinámicamente usando flatMap
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("Pepe")) {
                        return Stream.of(u); // Incluir solo usuarios con nombre "Pepe"
                    }
                    return Stream.empty(); // Excluir otros usuarios
                })
                // Operación intermedia para imprimir cada usuario filtrado
                .peek(System.out::println);

        // Contar la cantidad de elementos en el Stream resultante
        System.out.println(nombres.count());
    }
}