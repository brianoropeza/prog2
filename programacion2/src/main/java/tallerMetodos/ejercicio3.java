/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerMetodos;

/**
 *
 * @author autor
 */
public class ejercicio3 {
    
    
    public static double convertirDolaresAEuros(double dolares) {
        double tipoCambio = 1.33;
        return dolares / tipoCambio;
    }

    public static void main(String[] args) {
        double dolares = 500; 
        double euros = convertirDolaresAEuros(dolares);
        
        System.out.println(dolares + " dólares equivalen a " + euros + " euros.");
    }
}

    

