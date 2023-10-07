package modelo;

import java.util.ArrayList;
import java.util.List;
import vista.PrecioAccionesObservador;

public class Bolsa {
   private final List<Accion> accion = new ArrayList<>();
   private final List<PrecioAccionesObservador> observadores = new ArrayList<>();
   
   public List<Accion> getAcciones() {
   return accion;
    }

   public void agregarAccion(Accion stock) {
      accion.add(stock);
   }

   public void eliminarAccion(Accion stock) {
      accion.remove(stock);
   }

   public void agregarObservador(PrecioAccionesObservador observador) {
      observadores.add(observador);
   }

   public void eliminarObservador(PrecioAccionesObservador observador) {
      observadores.remove(observador);
   }

   public void establecerUmbrales(Accion accion, double umbralInferior, double umbralSuperior) {
      accion.setUmbralInferior(umbralInferior);
      accion.setUmbralSuperior(umbralSuperior);
   }

   public void cambioPrecioAcciones(Accion accion, double nuevoPrecio) {
      accion.setPrecioAnterior(accion.getPrecioActual());
      accion.setPrecioActual(nuevoPrecio);
      notificarObservadores(accion);
   }

   private void notificarObservadores(Accion accion) {
      for (PrecioAccionesObservador observador : observadores) {
         observador.acutalizar(accion);
      }
   }
   
   public Accion buscarAccionPorNombre(String nombre) {
        for (Accion stock : accion) {
           if (stock.getNombre().equalsIgnoreCase(nombre)) {
              return stock;
           }    
        }
       return null; // Si no se encuentra la acción, devuelve null
    }
   public void listarAccionesExistentes() {
      System.out.println("Acciones existentes en la bolsa:");
      for (Accion ac : this.getAcciones()) {
         System.out.println("Nombre: " + ac.getNombre());
         System.out.println("Precio Actual: " + ac.getPrecioActual());
         System.out.println("Precio Anterior: " + ac.getPrecioAnterior());
         System.out.println("Umbral Inferior: " + ac.getUmbralInferior());
         System.out.println("Umbral Superior: " + ac.getUmbralSuperior());
         System.out.println("---------------------------");
      }
   }
}
