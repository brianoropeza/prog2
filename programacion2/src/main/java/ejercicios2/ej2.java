import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número ingresado (" + numero + ") es par.");
        } else {
            System.out.println("El número ingresado (" + numero + ") es impar.");
        }
        
        scanner.close();
    }
}
