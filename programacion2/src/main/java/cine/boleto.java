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
    private silla silla;

    public boleto() {
    }

    public boleto(pelicula pelicula, silla silla) {
        this.pelicula = pelicula;
        this.silla = silla;
    }

    public pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public silla getSilla() {
        return silla;
    }

    public void setSilla(silla silla) {
        this.silla = silla;
    }

    @Override
    public String toString() {
        return "boleto{" + "pelicula=" + pelicula + ", silla=" + silla + '}';
    }
    
    
}
