/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Equipo
 */
public class taquilla {
    private empleados empleado;
    private String tipoTaquilla;
    private String computador;
    private String impresoraBoletas;
    private String caja;

    public taquilla() {
    }

    public taquilla(empleados empleado, String tipoTaquilla, String computador, String impresoraBoletas, String caja) {
        this.empleado = empleado;
        this.tipoTaquilla = tipoTaquilla;
        this.computador = computador;
        this.impresoraBoletas = impresoraBoletas;
        this.caja = caja;
    }

    public empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleados empleado) {
        this.empleado = empleado;
    }

    public String getTipoTaquilla() {
        return tipoTaquilla;
    }

    public void setTipoTaquilla(String tipoTaquilla) {
        this.tipoTaquilla = tipoTaquilla;
    }

    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getImpresoraBoletas() {
        return impresoraBoletas;
    }

    public void setImpresoraBoletas(String impresoraBoletas) {
        this.impresoraBoletas = impresoraBoletas;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "taquilla{" + "empleado=" + empleado + ", tipoTaquilla=" + tipoTaquilla + ", computador=" + computador + ", impresoraBoletas=" + impresoraBoletas + ", caja=" + caja + '}';
    }
    
    
    
}
