package com.ingaamira.modules.oop.oop_projects.project_automovil.main;

import com.ingaamira.modules.oop.oop_projects.project_automovil.model.*;

/**
 * Clase de ejemplo que demuestra las relaciones entre objetos en el contexto de automóviles.
 * Se modelan relaciones como la asociación entre un automóvil y su conductor,
 * además de la composición con objetos como motor, estanque y ruedas.
 */
public class EjemploAutomovilRelacionesObjetos {

    /**
     * Método principal que crea instancias de automóviles y sus componentes,
     * estableciendo relaciones entre objetos y mostrando sus detalles.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // Creación de un conductor y su automóvil Subaru
        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        // Agregando ruedas al Subaru
        for (int i = 0; i < 5; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        // Creación de otro conductor y un Mazda
        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        // Agregando ruedas al Mazda
        for (int i = 0; i < 5; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        // Creación de otro conductor y un Nissan
        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        // Agregando ruedas al Nissan
        for (int i = 0; i < 5; i++) {
            nissan.addRueda(new Rueda("Pirelli", 20, 11.5));
        }

        // Creación de otro Nissan con otro conductor y ruedas predefinidas
        Persona lalo = new Persona("Lalo", "Mena");
        Rueda[] ruedasNissan2 = {
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)
        };

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        // Configuración del color de la patente para todos los automóviles
        Automovil.setColorPatente(Color.AZUL);

        // Creación de un automóvil vacío
        Automovil auto = new Automovil();

        // Mostrar detalles de los automóviles
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*
        // Código opcional para mostrar conductor y ruedas de un automóvil
        System.out.println("Conductor Subaru: " + subaru.getConductor());
        System.out.println("Ruedas Subaru: ");
        for (Rueda r : subaru.getRuedas()) {
            System.out.println(r.getFabricante() + ", Aro: " + r.getAro() + ", Ancho: " + r.getAncho());
        }
        */
    }
}
