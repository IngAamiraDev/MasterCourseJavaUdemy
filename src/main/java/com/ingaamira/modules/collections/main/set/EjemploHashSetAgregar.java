package com.ingaamira.modules.collections.main.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs);

        /*Ordenando ArrayList a partir del Set*/
        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);
        System.out.println(lista);

        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados = " + b);
        System.out.println(hs);

        /* Set:
         - No permite elementos duplicados
         - No mantiene un orden específico al almacenar los datos
         - Cada add retorna un boolean
         - Los "Set" como las "Listas" comparten la misma interface "collection"
         - No se requiere declarar el tamaño del array
        */

    }
}
