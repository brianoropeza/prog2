import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");

            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
