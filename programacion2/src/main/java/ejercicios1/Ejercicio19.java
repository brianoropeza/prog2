/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int notaFinal;
        int correctas;
        int incorrectas;
        int noContestadas;
        int notaMaxima;
        double notaSobre10;
        
        System.out.print("Total de preguntas correctas: ");
        correctas = i.nextInt();
        System.out.print("Total de preguntas incorrectas: ");
        incorrectas = i.nextInt();
        System.out.print ("Total de preguntas no contestadas: ");
        noContestadas = i.nextInt();
        
        
        notaMaxima = (correctas + incorrectas + noContestadas) * 5;
        notaFinal = (correctas*5) + (incorrectas*(-1));
        notaSobre10 = (double)(notaFinal*10) / notaMaxima;
        
        System.out.printf("La nota final es de: " + notaFinal);
    }
}
