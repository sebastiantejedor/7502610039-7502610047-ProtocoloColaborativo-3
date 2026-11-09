package Taller15.Ejercicio2;

public class CalculadoraPrecio {

    public double calcularPrecioConIVA(Producto producto) {

        return producto.getPrecio() * 1.19;
    }
}