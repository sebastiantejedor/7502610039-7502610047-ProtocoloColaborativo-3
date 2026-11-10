package Taller16.Ejercicio1;

public class Descuento {
    protected double valor;

    public Descuento(double valor) {
        this.valor = valor;
    }

    public double calcular(double precio) {
        return precio * valor / 100;
    }
}