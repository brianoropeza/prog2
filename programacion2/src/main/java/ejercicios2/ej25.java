import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de números primos a mostrar: ");
            int cantidad = scanner.nextInt();

            int numero = 2;
            int encontrados = 0;

            while (encontrados < cantidad) {
                if (esPrimo(numero)) {
                    System.out.print(numero + " ");
                    encontrados++;
                }
                numero++;
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
