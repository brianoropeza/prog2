/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

import java.util.Scanner;

/**
 * @author Equipo
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        double num;
        double raizcuadrada;
        double raizcubica;
                
        
        System.out.println("INGRESE UN NUMERO PARA CALCULARLE RAIZ CUADRADA Y CUBICA");
        num = i.nextDouble();
        
        
        raizcuadrada= Math.sqrt(num);
        
        raizcubica= Math.pow(num , 1/3);
        
        
        System.out.println("la raiz cuadrada de :"+ num +" es" + raizcuadrada);
        System.out.println("la raiz cubica de :"+ num +" es" + raizcubica);  
    }
}
