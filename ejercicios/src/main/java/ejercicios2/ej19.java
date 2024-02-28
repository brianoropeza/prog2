import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese caracteres. Presione espacio para salir.");

            while (true) {
                System.out.print("Ingrese un caracter: ");
                char caracter = scanner.next().charAt(0);

                if (caracter == ' ') {
                    break;
                }

                if (esVocal(caracter)) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }
        }
    }

    public static boolean esVocal(char caracter) {
        caracter = Character.toUpperCase(caracter); // Convertir a mayúscula para simplificar la comparación

        return caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U';
    }
}
