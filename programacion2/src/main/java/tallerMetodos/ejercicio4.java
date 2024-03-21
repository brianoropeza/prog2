/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerMetodos;

/**
 *
 * @author autor
 */
public class ejercicio4 {
    
    public static final double PI = 3.1416;

    public static double calcularPerimetroCircunferencia(double radio) {
        return 2 * PI * radio;
    }

    public static double calcularAreaCirculo(double radio) {
        return PI * Math.pow(radio, 2);
    }

    public static double calcularVolumenEsfera(double radio) {
        return (4 * PI * Math.pow(radio, 3)) / 3;
    }

    public static double calcular(double radio, String tipoCalculo) {
        switch (tipoCalculo.toLowerCase()) {
            case "perimetro":
                return calcularPerimetroCircunferencia(radio);
            case "area":
                return calcularAreaCirculo(radio);
            case "volumen":
                return calcularVolumenEsfera(radio);
            default:
                System.out.println("Tipo de cálculo no válido.");
                return 0;
        }
    }

    public static void main(String[] args) {
        double radio = 10; 
        String tipoCalculo = "area"; 

        double resultado = calcular(radio, tipoCalculo);
        if (resultado != 0) {
            System.out.println("El resultado del cálculo es: " + resultado);
        }
    }
}

    

