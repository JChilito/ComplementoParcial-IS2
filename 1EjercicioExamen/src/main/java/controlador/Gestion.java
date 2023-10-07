package controlador;

import modelo.Accion;
import modelo.Bolsa;
import vista.SMSObservador;

public class Gestion {
    Bolsa bolsa = new Bolsa();
    Accion accionAux = new Accion();
    SMSObservador smsObservador = new SMSObservador(null, null);
    
    public Gestion(){
        
    }
    
    public void agregarAccion(String nombre, double precioActual, double precioAnterior, double umbralInferior, double umbralSuperior){
        Accion nuevaAccion = new Accion(nombre, precioActual, precioAnterior, umbralInferior, umbralSuperior);
        bolsa.agregarAccion(nuevaAccion);
    }
    
    public boolean eliminarAccion(String nombre){
      Accion accionExistente = bolsa.buscarAccionPorNombre(nombre);
      if (accionExistente != null) {
         bolsa.eliminarAccion(accionExistente);
         return true;
      }
      return false;
    }
    
    public void listarAccionesExistentes() {
        bolsa.listarAccionesExistentes();
    }
    
    public boolean simularCambioPrecio(String nombre){
      Accion accionExistente = bolsa.buscarAccionPorNombre(nombre);
      if (accionExistente != null) {
         bolsa.eliminarAccion(accionExistente);
         return true;
      }
      return false;
    }
    
    public boolean buscarAccion(String nombre){
      Accion accionExistente = bolsa.buscarAccionPorNombre(nombre);
      if (accionExistente != null) {
          accionAux = accionExistente;
         return true;
      }
      return false;
    }
    
    public void cambioPrecioAcciones(double nuevoPrecio){
        bolsa.cambioPrecioAcciones(accionAux, nuevoPrecio);
        smsObservador.acutalizar(accionAux);
    }
}
