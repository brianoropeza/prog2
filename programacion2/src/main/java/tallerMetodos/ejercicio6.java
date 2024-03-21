/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerMetodos;

/**
 *
 * @author autor
 */
public class ejercicio6 {
     
    public static double convertirSegundos(double segundos, String tipo) {
        switch (tipo.toLowerCase()) {
            case "dias":
                return segundos / (24 * 60 * 60);
            case "horas":
                return segundos / (60 * 60);
            case "minutos":
                return segundos / 60;
            default:
                System.out.println("Tipo de conversión no válido.");
                return -1;
        }
    }

    public static void main(String[] args) {
        double segundos = 100000; 
        String tipo = "dias"; 
        
        double resultado = convertirSegundos(segundos, tipo);
        
        if(resultado != -1) {
            System.out.println(segundos + " segundos equivalen a " + resultado + " " + tipo);
        }
    }
}

    

