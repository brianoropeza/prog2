/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoSemana8;

/**
 *
 * @author Equipo
 */
public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calcularArea() {
        double s = (ladoA + ladoB + ladoC) / 2;
        double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        return area;
    }

    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public double calcularHipotenusa() {
        if (esTrianguloRectangulo()) {
            return Math.max(Math.max(ladoA, ladoB), ladoC);
        } else {
            return -1;
        }
    }

    private boolean esTrianguloRectangulo() {
        return (Math.pow(ladoA, 2) + Math.pow(ladoB, 2) == Math.pow(ladoC, 2)) ||
               (Math.pow(ladoA, 2) + Math.pow(ladoC, 2) == Math.pow(ladoB, 2)) ||
               (Math.pow(ladoB, 2) + Math.pow(ladoC, 2) == Math.pow(ladoA, 2));
    }

  
}

