package modelo;

public class Accion {
    private String nombre;
    private double precioActual;
    private double precioAnterior;
    private double umbralInferior;
    private double umbralSuperior;

    public Accion() {
        
    }

    public Accion(String nombre, double precioActual, double precioAnterior, double umbralInferior, double umbralSuperior) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.precioAnterior = precioAnterior;
        this.umbralInferior = umbralInferior;
        this.umbralSuperior = umbralSuperior;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precioActual
     */
    public double getPrecioActual() {
        return precioActual;
    }

    /**
     * @param precioActual the precioActual to set
     */
    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    /**
     * @return the precioAnterior
     */
    public double getPrecioAnterior() {
        return precioAnterior;
    }

    /**
     * @param precioAnterior the precioAnterior to set
     */
    public void setPrecioAnterior(double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }

    /**
     * @return the umbralInferior
     */
    public double getUmbralInferior() {
        return umbralInferior;
    }

    /**
     * @param umbralInferior the umbralInferior to set
     */
    public void setUmbralInferior(double umbralInferior) {
        this.umbralInferior = umbralInferior;
    }

    /**
     * @return the umbralSuperior
     */
    public double getUmbralSuperior() {
        return umbralSuperior;
    }

    /**
     * @param umbralSuperior the umbralSuperior to set
     */
    public void setUmbralSuperior(double umbralSuperior) {
        this.umbralSuperior = umbralSuperior;
    }

}