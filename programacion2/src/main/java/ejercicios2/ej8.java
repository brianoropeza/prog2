import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud de los lados del triángulo:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();
        
        String clasificacion = clasificarTriangulo(lado1, lado2, lado3);
        
        System.out.println("El triángulo es " + clasificacion);
        
        scanner.close();
    }
    
    public static String clasificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}
