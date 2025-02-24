package com.ingaamira.modules.stream.main;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de un {@code Stream} infinito generado con {@code Stream.generate()}.
 * <p>
 * Se crea un flujo de números enteros generados secuencialmente utilizando {@code AtomicInteger}.
 * - Se introduce una pausa de 2 segundos entre cada número generado.
 * - Se limita la generación a 7 números usando {@code limit(7)}.
 * - Se imprimen los valores generados.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {

        // Contador atómico para generar valores secuenciales
        AtomicInteger contador = new AtomicInteger(0);

        // Generar un Stream infinito con Stream.generate()
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2); // Simula un retraso de 2 segundos entre cada generación
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Restablece el estado de interrupción
                        throw new RuntimeException(e); // Relanza la excepción
                    }
                    return contador.incrementAndGet(); // Incrementa y devuelve el nuevo valor
                })
                .limit(7) // Limita la generación a 7 elementos
                .forEach(System.out::println); // Imprime cada número generado
    }
}