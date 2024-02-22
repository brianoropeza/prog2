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

public class Ejercicio17{
    
    
    public static void main(String[] args) {
        
    
        Scanner i = new Scanner(System.in);
        
        int hh;
        int mm;
        int ss;
        int tiempo;
        int stotal;
        int srestantes;
        
    
        System.out.println("para calcular introduce la hora fraccionada en:");
        System.out.println("introduce la hora:");
        hh=i.nextInt();
        System.out.println("introduce los minutos: ");
        mm=i.nextInt();
        System.out.println("introduce los segundos: ");
        ss=i.nextInt();
        System.out.println("introduce el tiempo del viaje en segundos: ");
        tiempo=i.nextInt();
        
        stotal= hh*3600 + mm*60 + ss + tiempo;
        
        
        
        hh= stotal / 3600;
        srestantes= stotal%60;
        mm= srestantes/60;
        ss= srestantes%60;
        
        
        System.out.println("La hora de llegada a la ciudad B será: "+ hh +":" + mm + ":"+ss);
  
   } 
}