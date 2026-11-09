package Taller15.Ejercicio2;

public class main {

    public static void main(String[] args) {

        Producto producto = new Producto("Teclado Gamer", 100000);

        EtiquetaProducto etiqueta = new EtiquetaProducto();
        CalculadoraPrecio calculadora = new CalculadoraPrecio();

        etiqueta.generarEtiqueta(producto);

        double precioFinal = calculadora.calcularPrecioConIVA(producto);

        System.out.println("Precio con IVA: $" + precioFinal);
    }
}