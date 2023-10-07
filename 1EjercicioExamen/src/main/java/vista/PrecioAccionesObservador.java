package vista;

import modelo.Accion;

public abstract class PrecioAccionesObservador {
   protected Accion sujeto;
   public abstract void acutalizar(Accion accion);
}
