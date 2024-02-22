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
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double v1;
        double v2;
        double distancia;
        double diffV;
        double tiempo;
        
        
        
        
        System.out.println("a que distacia estan los vehiculos en km");
        distancia= i.nextDouble();
        System.out.println("digite la velocidad 1  en km/h (mas lenta)");
        v1= i.nextDouble();
        System.out.println("digite la velocidad 2 km/h (mas rapida)");
        v2 = i.nextDouble();
        
        diffV=(v2-v1);
        tiempo= (distancia / diffV);
       
        
        System.out.println("el tiempo que tarda en alcanzar al vehiculo q va adelante es: "+(int)tiempo*60   +" minutos "); 
        
        
        
   } 
}
