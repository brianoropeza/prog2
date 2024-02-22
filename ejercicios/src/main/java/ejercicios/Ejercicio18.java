/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        String nombre1;
        String nombre2;
        String apellido1;
        String apelido2;    
        String iniciales;
        
        
        System.out.println("introduce tu nombre para leer la incial: ");
        nombre1=i.nextLine();
         System.out.println("introduce tu segundo nombre para leer la incial: ");
        nombre2=i.nextLine();
        System.out.println("introduce tu primer apellido para leer la incial: ");
        apellido1=i.nextLine();
        System.out.println("introduce tu segundo apellido para leer la incial: ");
        apelido2=i.nextLine();
        
        iniciales= nombre1.substring(0,1)+nombre1.substring(0,1)+apellido1.substring(0, 1)+apelido2.substring(0, 1);
        
        System.out.println("las iniciales son: " + iniciales);
    }
    
}
