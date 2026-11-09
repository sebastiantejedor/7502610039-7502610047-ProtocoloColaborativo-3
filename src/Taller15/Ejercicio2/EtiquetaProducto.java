package Taller15.Ejercicio2;

public class EtiquetaProducto {

    public void generarEtiqueta(Producto producto) {

        System.out.println("ETIQUETA DEL PRODUCTO");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
    }
}
