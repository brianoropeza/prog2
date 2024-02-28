import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de números a introducir: ");
            int cantidadNumeros = scanner.nextInt();

            int mayoresCero = 0;
            int menoresCero = 0;
            int igualesCero = 0;

            for (int i = 0; i < cantidadNumeros; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero > 0) {
                    mayoresCero++;
                } else if (numero < 0) {
                    menoresCero++;
                } else {
                    igualesCero++;
                }
            }

            System.out.println("Números mayores que 0: " + mayoresCero);
            System.out.println("Números menores que 0: " + menoresCero);
            System.out.println("Números iguales a 0: " + igualesCero);
        }
    }
}
