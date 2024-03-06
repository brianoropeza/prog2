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
public class empleados {
    private String nombre;
    private int numeroId;
    private LocalDateTime horario;
    private String cargo;

    public empleados() {
    }

    public empleados(String nombre, int numeroId, LocalDateTime horario, String cargo) {
        this.nombre = nombre;
        this.numeroId = numeroId;
        this.horario = horario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", numeroId=" + numeroId + ", horario=" + horario + ", cargo=" + cargo + '}';
    }
    
    
    
}
