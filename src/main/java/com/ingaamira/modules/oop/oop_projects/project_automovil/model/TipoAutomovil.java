package com.ingaamira.modules.oop.oop_projects.project_automovil.model;

/**
 * Enumeración que representa los diferentes tipos de automóviles.
 */
public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Auto utilitario", 3),
    SUV("SUV", "Todo terreno deportivo", 5);

    /** Nombre del tipo de automóvil. */
    private final String nombre;

    /** Número de puertas del automóvil. */
    private final int numeroPuerta;

    /** Descripción del tipo de automóvil. */
    private final String descripcion;

    /**
     * Constructor del enumerado TipoAutomovil.
     *
     * @param nombre        Nombre del tipo de automóvil.
     * @param descripcion   Breve descripción del automóvil.
     * @param numeroPuerta  Número de puertas del automóvil.
     */
    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre del tipo de automóvil.
     *
     * @return Nombre del tipo de automóvil.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de puertas del automóvil.
     *
     * @return Número de puertas del automóvil.
     */
    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    /**
     * Obtiene la descripción del tipo de automóvil.
     *
     * @return Descripción del tipo de automóvil.
     */
    public String getDescripcion() {
        return descripcion;
    }

}
