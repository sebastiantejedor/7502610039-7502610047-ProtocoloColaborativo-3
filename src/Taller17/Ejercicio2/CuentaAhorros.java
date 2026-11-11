package Taller17.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres / 100;
    }
}