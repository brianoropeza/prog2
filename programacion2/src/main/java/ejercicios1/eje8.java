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
public class eje8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    double sueldoBase;
    double comision;
    double venta1;
    double venta2;
    double venta3;
    double sueldoTotal;
    
    System.out.println("ingresa el sueldo base del vendedor");
    sueldoBase = scanner.nextDouble();
    
    System.out.println ("ingresa el valor de la primera venta");
    venta1 = scanner.nextDouble();
    System.out.println ("ingresa el valor de la segunda venta");
    venta2 = scanner.nextDouble();
    System.out.println ("ingresa el valor de la tercera venta");
    venta3 = scanner.nextDouble();
    
    comision = (venta1 + venta2 + venta3) * 0.10;
    
    sueldoTotal = (sueldoBase + comision);
    
    System.out.println("el sueldo total que recibira el vendedor teniendo en cuenta sus comisiones es: " + sueldoTotal);
    
    
    }
    
    
 }
