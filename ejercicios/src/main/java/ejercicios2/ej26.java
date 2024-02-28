import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el número de filas para la pirámide: ");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                // Espacios en blanco
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Números ascendentes
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // Números descendentes
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
