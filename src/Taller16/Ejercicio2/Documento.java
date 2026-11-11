package Taller16.Ejercicio2;

public class Documento {
    protected String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public void exportar() {
        System.out.println("Exportando " + titulo + " a PDF");
    }
}