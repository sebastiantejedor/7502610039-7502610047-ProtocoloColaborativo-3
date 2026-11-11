package Taller17.Ejercicio3;

public class Bicicleta extends Transporte {
    @Override
    public void mover() {
        System.out.println("La bicicleta avanza pedaleando");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se detiene con los frenos");
    }
}