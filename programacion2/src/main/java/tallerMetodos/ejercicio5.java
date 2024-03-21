/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerMetodos;

/**
 *
 * @author autor
 */
public class ejercicio5 {
    
    
    public static int convertirTiempoASegundos(int dias, int horas, int minutos) {
        int segundosPorDia = dias * 24 * 60 * 60;
        int segundosPorHoras = horas * 60 * 60;
        int segundosPorMinutos = minutos * 60;
        
        return segundosPorDia + segundosPorHoras + segundosPorMinutos;
    }

    public static void main(String[] args) {
        int dias = 5; 
        int horas = 10; 
        int minutos = 60; 
        
        int segundosTotales = convertirTiempoASegundos(dias, horas, minutos);
        
        System.out.println("El total de segundos es: " + segundosTotales);
    }
}

    

