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
public class eje2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    double perimetro;
    double area;
    double base;
    double altura;
    
    System.out.println("ingresa la base del rectangulo");
    base = scanner.nextDouble();
    System.out.println("ingresa la altura del rectangulo");
    altura = scanner.nextDouble();
    
    perimetro = 2 * (base + altura);
    area = base * altura;
    
    System.out.println("el perimetro del rectangulo es : " + perimetro + " y su area es :  " + area);
    
    
    
    } 
    
    
}
