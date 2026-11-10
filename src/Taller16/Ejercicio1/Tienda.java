package Taller16.Ejercicio1;

public class Tienda {
    public double precioFinal(double precio, Descuento descuento) {
        return precio - descuento.calcular(precio);
    }
}