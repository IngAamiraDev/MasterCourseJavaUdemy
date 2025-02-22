package com.ingaamira.modules.oop.automovil.main;

import com.ingaamira.modules.oop.automovil.model.*;

import java.util.Date;

/**
 * Clase de ejemplo que demuestra el uso de la clase Automovil.
 */
public class EjemploAutomovil {
    public static void main(String[] args) {

        // Creación de un objeto Automovil Subaru con motor de tipo BENCINA
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        // Creación de un objeto Automovil Mazda con motor de tipo DIESEL
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        // Creación de un objeto Automovil Nissan con motor de tipo DIESEL
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

        // Creación de otro objeto Nissan con características diferentes
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();

        /*
        // Mostrar detalles de los automóviles
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
         */


        // Comparaciones entre objetos Nissan
        System.out.println("¿Son iguales? " + (nissan == nissan2));
        System.out.println("¿Son iguales con equals? " + (nissan.equals(nissan2)));

        // Prueba de equals con otro tipo de objeto
        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        // Prueba de métodos de la clase Automovil
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        // Cálculo del consumo de combustible
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilómetros por litro: " + nissan.calcularConsumo(300, 60));

    }
}
