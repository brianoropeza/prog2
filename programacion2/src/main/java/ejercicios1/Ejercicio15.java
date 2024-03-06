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
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int valorA;
        int valorB;
        int valorC;

        System.out.print("Introduce el valor A: ");
        valorA = i.nextInt();
        System.out.print("Introduce el valor B: ");
        valorB = i.nextInt();

        valorC = valorA;
        valorA = valorB;
        valorB = valorC;

        System.out.println("nuevo valor A= " + valorA + " y nuevo valor B = " + valorB);
    }
}
