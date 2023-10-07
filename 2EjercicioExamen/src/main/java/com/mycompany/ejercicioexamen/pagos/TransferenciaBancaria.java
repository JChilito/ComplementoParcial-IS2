package com.mycompany.ejercicioexamen.pagos;

import com.mycompany.ejercicioexamen.formapago.*;


public class TransferenciaBancaria implements IMetodoPago{
    private int numCuenta;
    private double monto;

    public TransferenciaBancaria(int numCuenta, double monto) {
        this.numCuenta = numCuenta;
        this.monto = monto;
    }
    
    @Override
    public boolean procesoPago(double cantidad) {
        //System.out.println("pago de " + cantidad + "$ realizado.");
        return true;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
