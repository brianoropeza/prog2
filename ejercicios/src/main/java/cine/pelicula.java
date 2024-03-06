/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Equipo
 */
public class pelicula {
    
    private String nombre;
    private String genero;
    private int duracionMinutos;
    private int rangoEdad;

    public pelicula() {
    }

    public pelicula(String nombre, String genero, int duracionMinutos, int rangoEdad) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
        this.rangoEdad = rangoEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(int rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    @Override
    public String toString() {
        return "pelicula{" + "nombre=" + nombre + ", genero=" + genero + ", duracionMinutos=" + duracionMinutos + ", rangoEdad=" + rangoEdad + '}';
    } 
}
