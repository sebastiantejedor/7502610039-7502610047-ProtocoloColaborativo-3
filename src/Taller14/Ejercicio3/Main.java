package Taller14.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Perro();

        animal.comer();

        // Esto genera un error de compilacion:
        // animal.ladrar();
    }
}
