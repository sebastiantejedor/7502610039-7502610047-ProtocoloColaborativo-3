package Taller17.Ejercicio2;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}