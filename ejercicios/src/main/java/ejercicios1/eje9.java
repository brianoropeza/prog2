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
public class eje9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    double totalCompra;
    double precioFinal;
    
    System.out.println("ingresa el valor de la compra");
    totalCompra = scanner.nextDouble();
    
    precioFinal = (totalCompra * 0.15);
    
    System.out.println("el valor total de la compra teniendo en cuenta su descuento es: " + precioFinal); 
    
    }
    
}
