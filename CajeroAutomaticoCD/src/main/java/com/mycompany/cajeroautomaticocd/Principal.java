package com.mycompany.cajeroautomaticocd;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico(1000.0);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Retirar");
            System.out.println("2. Depositar");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double cantidad_retirar = scanner.nextDouble();
                    cajero.retirar(cantidad_retirar);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double cantidad_depositar = scanner.nextDouble();
                    cajero.depositar(cantidad_depositar);
                    break;
                case 3:
                    cajero.mostrarSaldo();
                    break;         
                case 4:
                    System.out.println("Gracias por utilizar el cajero automático.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}
