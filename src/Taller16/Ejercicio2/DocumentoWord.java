package Taller16.Ejercicio2;

public class DocumentoWord extends Documento {
    public DocumentoWord(String titulo) {
        super(titulo);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando " + titulo + " a Word");
    }
}