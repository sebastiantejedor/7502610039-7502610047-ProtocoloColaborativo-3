package Taller17.Ejercicio1;

import java.util.Locale;

public class Main {
    static void mostrarArea(Figura figura) {
        System.out.println("Area: " + String.format(Locale.US, "%.2f", figura.calcularArea()));
    }

    public static void main(String[] args) {
        Figura[] figuras = {new Circulo(3), new Rectangulo(4, 5)};

        for (Figura figura : figuras) {
            mostrarArea(figura);
        }
    }
}