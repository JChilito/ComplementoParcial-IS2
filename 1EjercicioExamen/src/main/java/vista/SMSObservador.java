package vista;

import modelo.Accion;

public class SMSObservador extends PrecioAccionesObservador {

    private final String numeroCelular;

    public SMSObservador(Accion sujeto, String numeroCelular) {
        this.sujeto = sujeto;
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void acutalizar(Accion accion) {
        String mensaje = "El precio de la acción " + accion.getNombre() + " ha cambiado a " + accion.getPrecioActual();
        System.out.println("Mensaje SMS enviado a " + numeroCelular + ": " + mensaje);
    }
}
