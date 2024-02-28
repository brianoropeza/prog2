/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas;
import java.util.Scanner;
/**
 *
 * @author julianamantilla
 */
public class eje10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
     double calificacionFinal;
     double parcial1;
     double parcial2;
     double parcial3;
     double examenFinal;
     double trabajoFinal;
     double notaParciales;
     double notaExamenFinal;
     double notaTrabajoFinal;
     
     
    System.out.println("ingresa la nota del parcial 1");
    parcial1 = scanner.nextDouble();
    System.out.println("ingresa la nota del parcial 2");
    parcial2 = scanner.nextDouble();
    System.out.println("ingresa la nota del parcial 3");
    parcial3 = scanner.nextDouble();
    
    notaParciales = (parcial1 + parcial2 + parcial3) * 0.55;
    
    System.out.println("ingrese la nota del examen final");
    notaExamenFinal = scanner.nextDouble();
    
    examenFinal = notaExamenFinal * 0.30;
    
    System.out.println("ingresa la nota del trabajo final");
    notaTrabajoFinal = scanner.nextDouble();
    
    trabajoFinal = notaTrabajoFinal * 0.15;
    
    calificacionFinal = (notaParciales + examenFinal + trabajoFinal) / 3;
    
    System.out.println("la calificacion final de la materia algoritmos seria: " + calificacionFinal);
    
    
    
    }
    
}
