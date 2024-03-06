/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Equipo
 */
public class sala {
    private String proyector;
    private String pantalla;
    private int numeroSala;
    private int capacidad;
    private String tipoSala;

    public sala() {
    }

    public sala(String proyector, String pantalla, int numeroSala, int capacidad, String tipoSala) {
        this.proyector = proyector;
        this.pantalla = pantalla;
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
    }

    public String getProyector() {
        return proyector;
    }

    public void setProyector(String proyector) {
        this.proyector = proyector;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    @Override
    public String toString() {
        return "sala{" + "proyector=" + proyector + ", pantalla=" + pantalla + ", numeroSala=" + numeroSala + ", capacidad=" + capacidad + ", tipoSala=" + tipoSala + '}';
    }
    
    
    
    
}
