
package com.mycompany.cajeroautomaticocd;


public class Cuenta {
    private double saldo;

    public Cuenta(double saldo_inicial) {
        this.saldo = saldo_inicial;
    }

    public double obtenerSaldo() {
        return this.saldo;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Depósito exitoso. Saldo actual: " + this.saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("No se puede retirar más de lo que hay en la cuenta.");
            return;
        }
        this.saldo -= cantidad;
        System.out.println("Retiro exitoso. Saldo actual: " + this.saldo);
    }
}
