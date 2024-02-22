/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Ejercicio11 {

//Escribe un programa que calcule la «distancia» que existe entre dos números pasados por teclado.
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int num1;
        int num2;
        int distacia;
        
        
        
        System.out.println("ingresa el numero 1:");
        num1 = i.nextInt();
        System.out.println("ingresa el numero 2:");
        num2 = i.nextInt();
        
        
        distacia=   Math.abs(num1-num2);
        
        System.out.println("la distancia entre ambos es:"+distacia);
        
        
    }
}
