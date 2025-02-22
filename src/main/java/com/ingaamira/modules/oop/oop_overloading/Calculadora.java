package com.ingaamira.modules.oop.oop_overloading;

public class Calculadora {

    // Constructor privado para evitar instancias
    private Calculadora() {}

    // Métodos para sumar enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int... argumentos) {
        int total = 0;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    // Métodos para sumar float y combinaciones con enteros
    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float sumar(float a, int b) {
        return a + b;
    }

    public static float sumar(int a, float b) {
        return a + b;
    }

    public static float sumar(float a, int... argumentos) {
        float total = a;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    // Métodos para sumar double
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double sumar(double... varargs) {
        double total = 0.0;
        for (double d : varargs) {
            total += d;
        }
        return total;
    }

    // Método para sumar valores String que representen números
    public static int sumar(String a, String b) {
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            return 0; // Retorna 0 si la conversión falla
        }
    }

}
