/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerMetodos;

import java.util.Scanner;

/**
 *
 * @author autor
 */
public class ejercicio2 {
    
    
    public static double calcularPerimetro(double lado1, double lado2) {
        return 2 * (lado1 + lado2);
    }
    
    public static double calcularArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer lado del rectángulo: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo lado del rectángulo: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Ingresa el tipo de cálculo (perímetro o área): ");
        String tipoCalculo = scanner.next();
        
        double resultado = 0;
        if (tipoCalculo.equalsIgnoreCase("perimetro")) {
            resultado = calcularPerimetro(lado1, lado2);
            System.out.println("El perímetro del rectángulo es: " + resultado);
        } else if (tipoCalculo.equalsIgnoreCase("area")) {
            resultado = calcularArea(lado1, lado2);
            System.out.println("El área del rectángulo es: " + resultado);
        } else {
            System.out.println("Tipo de cálculo no válido. Por favor, ingrese 'perimetro' o 'area'.");
        }
        
        scanner.close();
    }
}

    

