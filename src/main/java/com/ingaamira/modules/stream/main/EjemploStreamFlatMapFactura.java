package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Factura;
import com.ingaamira.modules.stream.models.Usuario;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que demuestra el uso de {@code flatMap()} en Streams para transformar una lista de usuarios en sus respectivas facturas.
 * <p>
 * - Se crean dos usuarios con sus respectivas facturas.
 * - Se utiliza {@code flatMap()} para obtener un flujo de facturas desde los usuarios.
 * - Se imprimen las descripciones de las facturas junto con el nombre del usuario.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        // Creación de usuarios con sus facturas
        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Pérez");

        u1.addFactura(new Factura("compras tecnologías"));
        u1.addFactura(new Factura("compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        // Lista de usuarios
        List<Usuario> usuarios = Arrays.asList(u1, u2);

        // Uso de flatMap() para obtener todas las facturas de los usuarios
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream()) // Extrae todas las facturas de los usuarios
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));

        /* Código equivalente con bucles tradicionales:
        for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }
        */
    }
}