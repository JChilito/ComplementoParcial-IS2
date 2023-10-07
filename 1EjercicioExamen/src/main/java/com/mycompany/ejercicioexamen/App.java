package com.mycompany.ejercicioexamen;

import controlador.Gestion;
import java.util.Scanner;

public class App {
   static Gestion gestion = new Gestion();
    
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      while (true) {
         System.out.println("Menú de opciones:");
         System.out.println("1. Agregar nueva acción");
         System.out.println("2. Eliminar acción existente");
         System.out.println("3. Listar acciones existentes");
         System.out.println("4. Simular cambio de precio");
         System.out.println("5. Salir");
         System.out.print("Seleccione una opción: ");

         int opcion = scanner.nextInt();

         switch (opcion) {
            case 1 -> agregarNuevaAccion();
            case 2 -> eliminarAccionExistente();
            case 3 -> listarAccionesExistentes();
            case 4 -> simularCambioPrecio();
            case 5 -> {
                System.out.println("Saliendo del programa.");
                System.exit(0);
              }
            default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
         }
      }
   }

   private static void agregarNuevaAccion() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nombre de la nueva acción: ");
      String nombre = scanner.nextLine();
      System.out.print("Precio actual: ");
      double precioActual = scanner.nextDouble();
      System.out.print("Precio anterior: ");
      double precioAnterior = scanner.nextDouble();
      System.out.print("Umbral inferior: ");
      double umbralInferior = scanner.nextDouble();
      System.out.print("Umbral superior: ");
      double umbralSuperior = scanner.nextDouble();
      
      gestion.agregarAccion(nombre, precioActual, precioAnterior, umbralInferior, umbralSuperior);
   }

   private static void eliminarAccionExistente() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nombre de la acción a eliminar: ");
      String nombre = scanner.nextLine();

      //Accion accionExistente = bolsa.buscarAccionPorNombre(nombre);
      if (gestion.eliminarAccion(nombre)) {
         System.out.println("La acción '" + nombre + "' ha sido eliminada.");
      } else {
         System.out.println("La acción '" + nombre + "' no se encontró en la bolsa.");
      }
   }

   private static void listarAccionesExistentes() {
      gestion.listarAccionesExistentes();
   }

   private static void simularCambioPrecio() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nombre de la acción a simular cambio de precio: ");
      String nombre = scanner.nextLine();

      if (gestion.buscarAccion(nombre)) {
         System.out.print("Nuevo precio para " + nombre + ": ");
         double nuevoPrecio = scanner.nextDouble();

         gestion.cambioPrecioAcciones(nuevoPrecio);

      } else {
         System.out.println("La acción '" + nombre + "' no se encontró en la bolsa.");
      }
   }
}

