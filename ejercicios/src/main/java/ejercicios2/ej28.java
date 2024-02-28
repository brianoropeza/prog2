import java.util.Scanner;

public class ej28 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];

            // Leer números
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Encontrar máximo y mínimo
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;
            for (int num : numeros) {
                if (num > maximo) {
                    maximo = num;
                }
                if (num < minimo) {
                    minimo = num;
                }
            }

            // Mostrar números con máximo y mínimo
            for (int num : numeros) {
                System.out.print(num);
                if (num == maximo) {
                    System.out.print(" máximo ");
                } else if (num == minimo) {
                    System.out.print(" mínimo ");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
