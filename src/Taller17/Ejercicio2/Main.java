package Taller17.Ejercicio2;

public class Main {
    static void operar(CuentaBancaria cuenta) {
        cuenta.depositar(100000);
        cuenta.retirar(30000);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }

    public static void main(String[] args) {
        CuentaBancaria corriente = new CuentaBancaria(50000);
        CuentaAhorros ahorros = new CuentaAhorros(200000, 5);

        operar(corriente);
        operar(ahorros);

        ahorros.aplicarInteres();
        System.out.println("Saldo con interes: " + ahorros.getSaldo());
    }
}