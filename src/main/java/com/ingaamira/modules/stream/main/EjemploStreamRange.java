package com.ingaamira.modules.stream.main;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Clase que demuestra el uso de Streams en Java para generar un rango de números enteros y calcular estadísticas.
 * <p>
 * Se utiliza {@code IntStream.range()} para generar un flujo de números del 5 al 19 (el límite superior es exclusivo).
 * Luego, con {@code summaryStatistics()}, se obtienen valores estadísticos como el mínimo, máximo, suma, promedio y cantidad total.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamRange {
    public static void main(String[] args) {

        // Generar un IntStream con un rango de valores del 5 al 19 (20 es exclusivo)
        IntStream num = IntStream.range(5, 20).peek(System.out::println);

        // Generar un IntStream con un rango de valores del 5 al 20 (20 es inclusivo)
        //IntStream num = IntStream.rangeClosed(5, 20).peek(System.out::println);

        // Obtener estadísticas sobre los valores del Stream
        IntSummaryStatistics stats = num.summaryStatistics();

        // Imprimir los valores estadísticos
        System.out.println("Máximo: " + stats.getMax());
        System.out.println("Mínimo: " + stats.getMin());
        System.out.println("Suma: " + stats.getSum());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Total de elementos: " + stats.getCount());
    }
}