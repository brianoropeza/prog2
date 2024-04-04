/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoSemana8;

/**
 *
 * @author Equipo
 */
public class Cuadrado {
    private double lado;

    public Cuadrado() {
    }

    
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
      public double calcularArea() {
        return lado * lado;
    }
    
     public double calcularPerimetro() {
        return 4 * lado;
    }

    
}
