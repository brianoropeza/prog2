import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una letra: ");
        String entrada = scanner.nextLine();
        
        if (entrada.length() == 1 && Character.isUpperCase(entrada.charAt(0))) {
            System.out.println("La entrada es una letra mayúscula.");
        } else {
            System.out.println("La entrada no es una letra mayúscula.");
        }
        
        scanner.close();
    }
}
