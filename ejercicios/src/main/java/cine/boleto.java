/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Equipo
 */
public class boleto {
    private pelicula pelicula;
    private sala sala;
    private funcion funcion;

    public boleto() {
    }

    public boleto(pelicula pelicula, sala sala, funcion funcion) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.funcion = funcion;
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

    @Override
    public String toString() {
        return "boleto{" + "pelicula=" + pelicula + ", sala=" + sala + ", funcion=" + funcion + '}';
    }
    
    
}
