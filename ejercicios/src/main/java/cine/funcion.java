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
public class funcion {
    private LocalDateTime hora;
    private pelicula pelicula;
    private sala sala;

    public funcion() {
    }

    public funcion(LocalDateTime hora, pelicula pelicula, sala sala) {
        this.hora = hora;
        this.pelicula = pelicula;
        this.sala = sala;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
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

    @Override
    public String toString() {
        return "funcion{" + "hora=" + hora + ", pelicula=" + pelicula + ", sala=" + sala + '}';
    }
    
    
}
