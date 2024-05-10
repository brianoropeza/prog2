/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triquitraque;

/**
 *
 * @author Equipo
 */
public class Jugador {
    
    private String nombre;
    private char ficha;
    private String color;

    public Jugador() {
    }

    public Jugador(String nombre, String color, char ficha) {
        this.nombre = nombre;
        this.color = color;
        this.ficha = ficha;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }

    public char getFicha() {
        return ficha;
    }

    public String getColor() {
        return color;
    }

    public boolean buscarJugador(char ficha) {

        return this.ficha == ficha;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", ficha=" + ficha + ", color=" + color + '}';
    }

    
    
    
}
