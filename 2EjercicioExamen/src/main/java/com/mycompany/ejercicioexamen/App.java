package com.mycompany.ejercicioexamen;

import com.mycompany.ejercicioexamen.formapago.IMetodoPago;
import com.mycompany.ejercicioexamen.pagos.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido al sistema de pago. Por favor, seleccione una forma de pago:");
            System.out.println("1. Tarjeta de Crédito");
            System.out.println("2. PayPal");
            System.out.println("3. Transferencia Bancaria");
            
            int opcion = scanner.nextInt();
            
            IMetodoPago metodoPago = null;
            double cantidadPagar = 0.0;
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el número de tarjeta de crédito:");
                    String numeroTarjeta = scanner.next();
                    System.out.println("Ingrese el monto a pagar:");
                    cantidadPagar = scanner.nextDouble();
                    metodoPago = new TarjetaCredito(numeroTarjeta, 1000000.0);
                }
                case 2 -> {
                    System.out.println("Ingrese su usuario de PayPal:");
                    String usuarioPayPal = scanner.next();
                    System.out.println("Ingrese su contraseña de PayPal:");
                    String contraseniaPayPal = scanner.next();
                    System.out.println("Ingrese el monto a pagar:");
                    cantidadPagar = scanner.nextDouble();
                    metodoPago = new PayPal(usuarioPayPal, contraseniaPayPal);
                }
                case 3 -> {
                    System.out.println("Ingrese el número de cuenta bancaria:");
                    int numCuenta = scanner.nextInt();
                    System.out.println("Ingrese el monto a transferir:");
                    cantidadPagar = scanner.nextDouble();
                    metodoPago = new TransferenciaBancaria(numCuenta, 1000000);
                }
                default -> {
                    System.out.println("Opción no válida.");
                    scanner.close();
                    return;
                }
            }
            
            boolean pagoExitoso = metodoPago.procesoPago(cantidadPagar);
            
            if (pagoExitoso) {
                System.out.println("Pago exitoso.");
            } else {
                System.out.println("Pago fallido.");
            }
        }
    }
}
