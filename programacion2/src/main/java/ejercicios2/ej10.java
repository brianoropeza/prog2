import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tipos de uva: A o B");
        System.out.print("Ingrese el tipo de uva: ");
        char tipo = scanner.next().charAt(0);
        
        System.out.println("Tamaños de uva: 1 o 2");
        System.out.print("Ingrese el tamaño de uva: ");
        int tamaño = scanner.nextInt();
        
        double precioInicial = determinarPrecioInicial(tipo);
        double precioFinal = calcularPrecioFinal(precioInicial, tamaño, tipo);
        
        System.out.println("El precio final por kilo de uva es: " + precioFinal + " euros.");
        
        scanner.close();
    }
    
    public static double determinarPrecioInicial(char tipo) {
        if (tipo == 'A') {
            return 0.80; // Precio inicial para tipo A
        } else if (tipo == 'B') {
            return 0.70; // Precio inicial para tipo B
        } else {
            System.out.println("Tipo de uva no válido. Se asume tipo A.");
            return 0.80; // Si el tipo no es A ni B, se asume tipo A
        }
    }
    
    public static double calcularPrecioFinal(double precioInicial, int tamaño, char tipo) {
        if (tipo == 'A') {
            if (tamaño == 1) {
                return precioInicial + 0.20; // Cargar 20 céntimos al precio inicial para tamaño 1
            } else if (tamaño == 2) {
                return precioInicial + 0.30; // Cargar 30 céntimos al precio inicial para tamaño 2
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                return precioInicial - 0.30; // Restar 30 céntimos al precio inicial para tamaño 1
            } else if (tamaño == 2) {
                return precioInicial - 0.50; // Restar 50 céntimos al precio inicial para tamaño 2
            }
        }
        
        // Si el tipo o el tamaño no son válidos, devuelve el precio inicial
        return precioInicial;
    }
}
