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
public class eje3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    double hipotenusa;
    double cat1;
    double cat2;
    
    System.out.println("ingresa el valor del cateto1");
    cat1 = scanner.nextDouble();
    System.out.println("ingresa el valor del cateto2");
    cat2 = scanner.nextDouble();
    
    hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
    
    System.out.println("la hipotenusa de este triangulo rectangulo es: " + hipotenusa);
    
    } 
    
}
