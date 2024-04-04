/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoSemana8;


import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Equipo
 */
 //Persona: Metodo que permita conocer la cantidad de años, meses y dia de vida.
public class Persona {
    
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
     public void calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.println(nombre + " tiene: " + años + " años, " + meses + " meses, y " + dias + " días de vida.");
    }
}
    
    
  
