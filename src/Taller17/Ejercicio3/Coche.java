package Taller17.Ejercicio3;

public class Coche extends Transporte {
    @Override
    public void mover() {
        System.out.println("El coche avanza con el motor");
    }

    @Override
    public void detener() {
        System.out.println("El coche se detiene con el freno");
    }
}