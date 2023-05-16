/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroautomaticocd;

/**
 *
 * @author A20KevinPC
 */
public class CajeroAutomatico {
    private Cuenta cuenta;
    

    public CajeroAutomatico(double saldo_inicial) {
        this.cuenta = new Cuenta(saldo_inicial);
        
    }

    public void retirar(double cantidad) {
        this.cuenta.retirar(cantidad);
    }

    public void depositar(double cantidad) {
        this.cuenta.depositar(cantidad);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + this.cuenta.obtenerSaldo());
    }

    

}
