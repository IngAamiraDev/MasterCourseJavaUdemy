package com.ingaamira.modules.oop.automovil.main;

import com.ingaamira.modules.oop.automovil.model.*;

import java.util.Arrays;

/**
 * Clase que demuestra el uso de arreglos y ordenación en objetos de tipo Automovil.
 */
public class EjemploAutomovilArreglo {

    /**
     * Método principal que crea una lista de automóviles, los ordena y los imprime.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // Creación de automóviles con conductores
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(new Persona("Luci", "Martínez"));

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(new Persona("Pato", "Rodríguez"));

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(new Persona("Bea", "González"));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        suzuki.setConductor(new Persona("Lalo", "Mena"));
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Pérez"));

        // Arreglo de automóviles
        Automovil[] autos = {subaru, mazda, nissan, suzuki, audi};

        // Ordenar los automóviles por fabricante (implementado en Automovil)
        Arrays.sort(autos);

        // Imprimir automóviles ordenados
        System.out.println("Automóviles ordenados por fabricante:");
        for (Automovil auto : autos) {
            System.out.println(auto);
        }
    }
}
