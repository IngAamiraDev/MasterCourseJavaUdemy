package com.ingaamira.modules.oop.oop_projects.project_automovil.main;

import com.ingaamira.modules.oop.oop_projects.project_automovil.model.*;

/**
 * Clase de ejemplo que demuestra el uso de la enumeración {@link TipoAutomovil}.
 */
public class EjemploAutomovilEnum {
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
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);

        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        // Obtener y mostrar información del tipo de automóvil Subaru
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        // Determinar el tipo de automóvil Mazda con una estructura switch
        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE ->
                    System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                    System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
            case FURGON ->
                    System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                    System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                    System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                    System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                    System.out.println("Es un automovil más grande, con maleta grande...");
        }

        // Listar todos los tipos de automóviles disponibles
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }
    }
}
