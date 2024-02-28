import java.util.Scanner;

public class  ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        int resultadoDado = scanner.nextInt();
        
        String caraOpuesta = determinarCaraOpuesta(resultadoDado);
        
        if (caraOpuesta.equals("ERROR")) {
            System.out.println("ERROR: número incorrecto");
        } else {
            System.out.println("El número en letras de la cara opuesta es: " + caraOpuesta);
        }
        
        scanner.close();
    }
    
    public static String determinarCaraOpuesta(int resultadoDado) {
        switch (resultadoDado) {
            case 1:
                return "Seis";
            case 2:
                return "Cinco";
            case 3:
                return "Cuatro";
            case 4:
                return "Tres";
            case 5:
                return "Dos";
            case 6:
                return "Uno";
            default:
                return "ERROR";
        }
    }
}
