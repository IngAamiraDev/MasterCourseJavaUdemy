package com.ingaamira.modules.collections.intro.main.list;

import com.ingaamira.modules.collections.intro.model.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Clase que demuestra el uso de {@link ArrayList} con objetos de tipo {@code Alumno}.
 * <p>
 * Se realizan operaciones como agregar, modificar, eliminar, verificar si un elemento
 * está en la lista y convertir la lista a un arreglo.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploArrayList {
    public static void main(String[] args) {

        // Crear una lista de alumnos
        List<Alumno> al = new ArrayList<>();

        // Imprimir lista vacía y su tamaño
        System.out.println(al + ", size = " + al.size());
        System.out.println("Está vacía = " + al.isEmpty());

        // Agregar alumnos a la lista
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));

        // Insertar un alumno en una posición específica
        al.add(2, new Alumno("Jano", 7));

        // Reemplazar un elemento en la lista
        al.set(3, new Alumno("Andres", 3));

        // Imprimir la lista después de modificaciones
        System.out.println(al + ", size = " + al.size());

        // Eliminar un alumno por objeto
        al.remove(new Alumno("Jano", 7));
        // al.remove(0); // Eliminación por índice comentada

        System.out.println(al + ", size = " + al.size());

        // Verificar si la lista contiene un elemento específico
        boolean b = al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene a Cata = " + b);

        // Convertir la lista a un array y recorrerlo
        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}