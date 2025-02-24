package com.ingaamira.modules.lambda.items.main;

import com.ingaamira.modules.lambda.items.model.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Clase que demuestra el uso de interfaces funcionales como {@link Consumer}, {@link BiConsumer}
 * y {@link Supplier} en combinación con expresiones lambda.
 * <p>
 * Se realizan operaciones como la impresión de fechas, la asignación de nombres a usuarios
 * y la creación de objetos utilizando proveedores (suppliers).
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploConsumer {

    /**
     * Método principal que ejecuta las operaciones con interfaces funcionales.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Consumer para formatear y imprimir una fecha
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date()); // Imprime la fecha actual en formato "yyyy-MM-dd"

        // BiConsumer para imprimir un nombre y una edad
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) ->
                System.out.println(nombre + ", tiene " + edad + " años!");
        consumidorBi.accept("pepe", 20); // Imprime: "pepe, tiene 20 años!"

        // Consumer para imprimir un mensaje usando una referencia a método
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda"); // Imprime: "Hola mundo lambda"

        // Lista de nombres y uso de forEach con el Consumer
        List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
        nombres.forEach(consumidor2); // Imprime cada nombre de la lista

        // Supplier para crear un nuevo objeto Usuario
        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get(); // Crea una instancia de Usuario

        // BiConsumer para asignar un nombre a un usuario
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrés"); // Asigna el nombre "Andrés" al usuario
        System.out.println("Nombre usuario: " + usuario.getNombre()); // Imprime: "Nombre usuario: Andrés"

        // Supplier para devolver un mensaje
        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";
        System.out.println(proveedor.get()); // Imprime: "Hola mundo lambda supplier"
    }
}