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
public class eje4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    System.out.println("cual es el primer numero?");
    numero1 = scanner.nextInt();
    System.out.println("cual es el segundo numero?");
    numero2 = scanner.nextInt();
    
    suma = numero1 + numero2;
    resta = numero1 - numero2;
    multiplicacion = numero1 * numero2;
    division = numero1 / numero2;
    
    System.out.println("el resultado de la suma es: " + suma + " el resultado de la resta es  " + resta + " el resultado de la multiplicacion es " + multiplicacion + " el resultado de la division es " + division);
    
    
    }   
}
