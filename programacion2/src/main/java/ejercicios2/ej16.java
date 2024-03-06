import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el peso del paquete en kilogramos: ");
            double peso = scanner.nextDouble();

            if (peso <= 5) {
                System.out.print("Ingrese la zona de destino (1-América del Norte, 2-América Central, 3-América del Sur, 4-Europa, 5-Asia): ");
                int zona = scanner.nextInt();

                double costoPorKg = 0.0;
                switch (zona) {
                    case 1:
                        costoPorKg = 24.00;
                        break;
                    case 2:
                        costoPorKg = 20.00;
                        break;
                    case 3:
                        costoPorKg = 21.00;
                        break;
                    case 4:
                        costoPorKg = 10.00;
                        break;
                    case 5:
                        costoPorKg = 18.00;
                        break;
                    default:
                        System.out.println("Zona de destino no válida.");
                        return;
                }

                double costoTotal = peso * costoPorKg;
                System.out.println("El costo de entrega del paquete es: " + costoTotal + " euros.");
            } else {
                System.out.println("El paquete con un peso superior a 5kg no puede ser transportado.");
            }
        }
    }
}
