package com.mycompany.ejercicioexamen.pagos;

import com.mycompany.ejercicioexamen.formapago.*;

public class TarjetaCredito implements IMetodoPago{
    private String numeroTarjeta;
    private double limite;
    
    public TarjetaCredito(){
        this.numeroTarjeta = "";
        this.limite = 0;
    }

    public TarjetaCredito(String numeroTarjeta, double limite) {
        this.numeroTarjeta = numeroTarjeta;
        this.limite = limite;
    }
    
    @Override
    public boolean procesoPago(double cantidad) {
        if (cantidad <= limite) {
            limite -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
