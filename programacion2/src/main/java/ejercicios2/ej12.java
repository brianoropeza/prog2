import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();
        
        System.out.println("Ingrese el día de la semana (1 para Domingo, 2 para Lunes, ..., 7 para Sábado): ");
        int dia = scanner.nextInt();
        
        System.out.println("Ingrese el turno de la llamada (1 para mañana, 2 para tarde): ");
        int turno = scanner.nextInt();
        
        double costoLlamada = calcularCostoLlamada(duracionLlamada);
        double impuesto = calcularImpuesto(dia, turno, costoLlamada);
        double costoTotal = costoLlamada + impuesto;
        
        System.out.println("El costo de la llamada es de: " + costoLlamada + " euros.");
        System.out.println("El impuesto a pagar es de: " + impuesto + " euros.");
        System.out.println("El costo total a pagar es de: " + costoTotal + " euros.");
        
        scanner.close();
    }
    
    public static double calcularCostoLlamada(int duracionLlamada) {
        if (duracionLlamada <= 5) {
            return 1.0; 
        } else if (duracionLlamada <= 8) {
            return 1.0 + 0.80 * (duracionLlamada - 5); // Los siguientes 3 minutos cuestan 80 céntimos cada uno
        } else if (duracionLlamada <= 10) {
            return 1.0 + 0.80 * 3 + 0.70 * (duracionLlamada - 8); // Los siguientes 2 minutos cuestan 70 céntimos cada uno
        } else {
            return 1.0 + 0.80 * 3 + 0.70 * 2 + 0.50 * (duracionLlamada - 10); // A partir del décimo minuto, cuestan 50 céntimos cada uno
        }
    }
    
    public static double calcularImpuesto(int dia, int turno, double costoLlamada) {
        double impuesto = 0.0;
        
        if (dia == 1) {
            impuesto = costoLlamada * 0.03; // Impuesto del 3% si es domingo
        } else {
            if (turno == 1) {
                impuesto = costoLlamada * 0.15; // Impuesto del 15% en turno de mañana
            } else {
                impuesto = costoLlamada * 0.10; // Impuesto del 10% en turno de tarde
            }
        }
        
        return impuesto;
    }
}
