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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner i = new  Scanner(System.in);
        int numero;
        int digito1;
        int digito2;
        int inverso;
        
        System.out.println("introduce el numero:");
        numero=i.nextInt();
        
        digito1 = (numero / 10);
        digito2 =( numero % 10);
        inverso =  digito2*10 + digito1;
        
        System.out.println("el numero: " + numero + " inverso es: "+ inverso);
      
    }
    
}
