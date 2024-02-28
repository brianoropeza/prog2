import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int limiteInferior, limiteSuperior;

            do {
                System.out.print("Ingrese el límite inferior del intervalo: ");
                limiteInferior = scanner.nextInt();
                System.out.print("Ingrese el límite superior del intervalo: ");
                limiteSuperior = scanner.nextInt();

                if (limiteInferior > limiteSuperior) {
                    System.out.println("El límite inferior no puede ser mayor que el límite superior. Inténtelo de nuevo.");
                }
            } while (limiteInferior > limiteSuperior);

            int sumaIntervalo = 0;
            int numerosFueraIntervalo = 0;
            boolean limiteInferiorEncontrado = false;
            boolean limiteSuperiorEncontrado = false;

            System.out.println("Ingrese números. Presione 0 para salir.");

            while (true) {
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();

                if (numero == 0) {
                    break;
                }

                if (numero > limiteInferior && numero < limiteSuperior) {
                    sumaIntervalo += numero;
                } else {
                    numerosFueraIntervalo++;
                }

                if (numero == limiteInferior) {
                    limiteInferiorEncontrado = true;
                }
                if (numero == limiteSuperior) {
                    limiteSuperiorEncontrado = true;
                }
            }

            System.out.println("La suma de los números dentro del intervalo es: " + sumaIntervalo);
            System.out.println("Cantidad de números fuera del intervalo: " + numerosFueraIntervalo);
            if (limiteInferiorEncontrado) {
                System.out.println("Se introdujo un número igual al límite inferior del intervalo.");
            }
            if (limiteSuperiorEncontrado) {
                System.out.println("Se introdujo un número igual al límite superior del intervalo.");
            }
        }
    }
}
