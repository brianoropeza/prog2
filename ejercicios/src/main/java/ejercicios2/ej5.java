import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        
        double resultado = calcularPotencia(base, exponente);
        
        System.out.println("El resultado de la potencia es: " + resultado);
        
        scanner.close();
    }
    
    public static double calcularPotencia(double base, int exponente) {
        if (exponente > 0) {
            return Math.pow(base, exponente);
        } else if (exponente == 0) {
            return 1;
        } else {
            
            int exponentePositivo = Math.abs(exponente);
            return 1 / Math.pow(base, exponentePositivo);
        }
    }
}
