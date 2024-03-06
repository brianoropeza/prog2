/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;
import java.time.LocalDateTime;

/**
 *
 * @author Equipo
 */
public class cine {
    private pelicula pelicula;
    private sala sala;
    private funcion funcion;
    private cliente cliente;
    private taquilla taquilla;
    private boleto boleto;
    private silla silla;
    private empleados empleados;
    private baño baño;

    public cine() {
    }

    public cine(pelicula pelicula, sala sala, funcion funcion, cliente cliente, taquilla taquilla, boleto boleto, silla silla, empleados empleados, baño baño) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.funcion = funcion;
        this.cliente = cliente;
        this.taquilla = taquilla;
        this.boleto = boleto;
        this.silla = silla;
        this.empleados = empleados;
        this.baño = baño;
    }

    public pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public sala getSala() {
        return sala;
    }

    public void setSala(sala sala) {
        this.sala = sala;
    }

    public funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(funcion funcion) {
        this.funcion = funcion;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public taquilla getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(taquilla taquilla) {
        this.taquilla = taquilla;
    }

    public boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(boleto boleto) {
        this.boleto = boleto;
    }

    public silla getSilla() {
        return silla;
    }

    public void setSilla(silla silla) {
        this.silla = silla;
    }

    public empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(empleados empleados) {
        this.empleados = empleados;
    }

    public baño getBaño() {
        return baño;
    }

    public void setBaño(baño baño) {
        this.baño = baño;
    }

    @Override
    public String toString() {
        return "cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", funcion=" + funcion + ", cliente=" + cliente + ", taquilla=" + taquilla + ", boleto=" + boleto + ", silla=" + silla + ", empleados=" + empleados + ", ba\u00f1o=" + baño + '}';
    }
    
    
    
}
