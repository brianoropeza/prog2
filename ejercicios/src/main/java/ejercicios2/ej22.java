import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la base: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese el exponente (entero positivo): ");
            int exponente = scanner.nextInt();

            double resultado = potencia(base, exponente);
            System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
        }
    }

    public static double potencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
