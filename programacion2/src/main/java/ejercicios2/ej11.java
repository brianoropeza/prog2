import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de alumnos que participarán en el viaje: ");
        int numAlumnos = scanner.nextInt();
        
        double costoPorAlumno = determinarCostoPorAlumno(numAlumnos);
        double costoTotal = calcularCostoTotal(numAlumnos, costoPorAlumno);
        
        System.out.println("El costo por alumno es de: " + costoPorAlumno + " euros.");
        System.out.println("El costo total para la compañía de autobuses es de: " + costoTotal + " euros.");
        
        scanner.close();
    }
    
    public static double determinarCostoPorAlumno(int numAlumnos) {
        if (numAlumnos >= 100) {
            return 65.0; // Costo por alumno si son 100 o más alumnos
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            return 70.0; // Costo por alumno si son de 50 a 99 alumnos
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            return 95.0; // Costo por alumno si son de 30 a 49 alumnos
        } else {
            return 4000.0 / numAlumnos; // Costo fijo del autobús si son menos de 30 alumnos
        }
    }
    
    public static double calcularCostoTotal(int numAlumnos, double costoPorAlumno) {
        return numAlumnos * costoPorAlumno;
    }
}
