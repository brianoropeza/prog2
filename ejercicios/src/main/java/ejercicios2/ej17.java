import java.util.Random;
import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int numeroAdivinar = random.nextInt(100) + 1;
            int intentos = 10;

            System.out.println("¡Bienvenido al juego de adivinar el número!");
            System.out.println("Tienes 10 intentos para adivinar un número entre 1 y 100.");

            while (intentos > 0) {
                System.out.print("Introduce tu número (Intentos restantes: " + intentos + "): ");
                int numeroUsuario = scanner.nextInt();
                
                if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número en " + (11 - intentos) + " intentos!");
                    return;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
                
                intentos--;
            }

            System.out.println("¡Lo siento! Has agotado todos tus intentos.");
            System.out.println("El número que debías adivinar era: " + numeroAdivinar);
        }
    }
}
