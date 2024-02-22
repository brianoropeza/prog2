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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int dosE;
        int unE;
        int cincuentaC;
        int veinteC;
        int diezC;
        int total;
        int Euros;
        int centimos;
        
        
        
        System.out.println("cuantas monedas de 2€ tienes?");
        dosE=i.nextInt();
        System.out.println("cuantas monedas de 1 € tienes?");
        unE=i.nextInt();
        System.out.println("cuantas monedas de 50cent tienes?");
        cincuentaC=i.nextInt();
        System.out.println("cuantas monedas de 20cent tienes?");
        veinteC=i.nextInt();
        System.out.println("cunatas monedas de 10cent tiens?");
        diezC=i.nextInt();
    
        
        
        
       total = dosE*200+ unE*100+cincuentaC*50+veinteC*20+diezC*10; 
       Euros=total/100;
       centimos=total%100;
       
        System.out.println("tienes un total de "+Euros+"euros y "+centimos+"centimos. :)");
        
        
        
        
        
    }
}
