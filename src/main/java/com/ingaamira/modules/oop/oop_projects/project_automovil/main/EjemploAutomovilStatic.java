package com.ingaamira.modules.oop.oop_projects.project_automovil.main;

import com.ingaamira.modules.oop.oop_projects.project_automovil.model.*;

/**
 * Clase de ejemplo para demostrar el uso de la clase {@code Automovil}
 * y sus métodos estáticos.
 */
public class EjemploAutomovilStatic {

    /**
     * Método principal que ejecuta la demostración del uso de objetos de la clase {@code Automovil}.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // Configuración de la capacidad estática del estanque
        Automovil.setCapacidadEstanqueEstatico(45);

        // Creación de un automóvil Subaru
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        // Creación de un automóvil Mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        // Creación de un automóvil Nissan
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        // Creación de otro Nissan con diferentes características
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        // Configuración del color de la patente de forma estática
        Automovil.setColorPatente(Color.AZUL);

        // Creación de un automóvil sin configuración inicial
        Automovil auto = new Automovil();

        /*
        // Impresión de detalles de los automóviles
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
         */

        // Impresión de valores estáticos de la clase Automovil
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litro = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad máxima en carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima en ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        // Uso de la enumeración TipoAutomovil
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo Subaru: " + tipoSubaru.getNombre());
        System.out.println("Descripción Subaru: " + tipoSubaru.getDescripcion());

        // Cálculo del consumo de combustible
        System.out.println(mazda.calcularConsumo(300, 70));
    }
}
