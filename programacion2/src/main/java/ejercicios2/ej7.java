import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas y el radio de la primera circunferencia:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        
        System.out.println("Ingrese las coordenadas y el radio de la segunda circunferencia:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        
        String clasificacion = clasificarCircunferencias(x1, y1, r1, x2, y2, r2);
        
        System.out.println("Las circunferencias son " + clasificacion);
        
        scanner.close();
    }
    
    public static String clasificarCircunferencias(double x1, double y1, double r1, double x2, double y2, double r2) {
        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        if (distanciaCentros > r1 + r2) {
            return "exteriores";
        } else if (distanciaCentros == r1 + r2) {
            return "tangentes exteriores";
        } else if (distanciaCentros < Math.abs(r1 - r2)) {
            return "interiores";
        } else if (distanciaCentros == Math.abs(r1 - r2)) {
            return "tangentes interiores";
        } else {
            return "secantes";
        }
    }
}

