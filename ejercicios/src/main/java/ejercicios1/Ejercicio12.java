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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        int x1;
        int y1;
        int x2;
        int y2;
        double distancia;
        
        
        System.out.println("introduce el valor x del primer punto:");
        x1=i.nextInt();
        System.out.println("introduce el valor y del primer punto:");
        y1=i.nextInt();
        System.out.println("introduce el valor x del segundo punto:");
        x2=i.nextInt();
        System.out.println("introduce el valor y del segundo punto:");
        y2=i.nextInt();
        
        
        
        distancia = Math.sqrt(Math.pow((x2- x1),2)+ Math.pow((y1- y1),2 ));
        
        
        
        System.out.println("la disatcnia entre los puntos es:"+distancia);
        
        
    }
}
