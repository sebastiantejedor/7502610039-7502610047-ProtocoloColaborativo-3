package Taller17.Ejercicio3;

public class Main {
    static void usar(Transporte transporte) {
        transporte.mover();
        transporte.detener();
    }

    public static void main(String[] args) {
        usar(new Transporte());
        usar(new Bicicleta());
        usar(new Coche());
    }
}