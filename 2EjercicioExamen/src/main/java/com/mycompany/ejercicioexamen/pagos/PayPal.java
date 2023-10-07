package com.mycompany.ejercicioexamen.pagos;

import com.mycompany.ejercicioexamen.formapago.*;

public class PayPal implements IMetodoPago{
    private String usuario;
    private String contrasenia;
    private boolean estadoAutenticacion;

    public PayPal(){
        this.usuario = "";
        this.contrasenia = "";
    }
    
    public PayPal(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    
    @Override
    public boolean procesoPago(double cantidad) {
        return autenticar(usuario, contrasenia); //System.out.println("Informacion autenticada, pago con un total de " + cantidad + "$ realizado.");
        //System.out.println("Datos no autenticados.");
    }

    private boolean autenticar(String usuario, String contrasenia) {
        estadoAutenticacion = "valentina".equals(usuario) && "fernandez".equals(contrasenia);
        return estadoAutenticacion;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrsenia() {
        return contrasenia;
    }

    public void setContrsenia(String contrsenia) {
        this.contrasenia = contrsenia;
    }

    public boolean isEstadoAutenticacion() {
        return estadoAutenticacion;
    }

    public void setEstadoAutenticacion(boolean estadoAutenticacion) {
        this.estadoAutenticacion = estadoAutenticacion;
    }
    
    
}
