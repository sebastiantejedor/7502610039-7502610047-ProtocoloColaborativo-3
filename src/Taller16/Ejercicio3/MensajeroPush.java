package Taller16.Ejercicio3;

public class MensajeroPush extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificacion push: " + mensaje);
    }
}