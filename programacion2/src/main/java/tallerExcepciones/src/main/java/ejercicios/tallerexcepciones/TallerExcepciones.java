/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejercicios.tallerexcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Equipo
 */
public class TallerExcepciones {

    /**
     * 1_Excepciones revisadas (Checked Exceptions): Son aquellas que el
     * compilador obliga a manejar mediante el uso de try-catch o declararlas en
     * la firma del método con throws. Algunos ejemplos son IOException,
     * FileNotFoundException, etc.
     */
    public class CheckedExample {

        public static void main(String[] args) {
            try {
                try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
                    String linea = br.readLine();
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }

        /*2_Excepciones no revisadas (Unchecked Exceptions): Son aquellas que el compilador no requiere manejar explícitamente. 
    Incluyen subclases de RuntimeException y Error. Algunos ejemplos son NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, etc.*/
        public class UncheckedExample {

            public static void main(String[] args) {
                int[] arreglo = {1, 2, 3};
                try {
                    System.out.println(arreglo[3]);
                    // Intentamos acceder a un índice fuera del tamaño del arreglo
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Índice fuera de los límites del arreglo.");
                }
            }
        }

        /*3_Errores (Errors): Son condiciones anormales que no es posible prever. No es común manejar errores en el código, ya que su ocurrencia indica 
    un problema grave y no recuperable, como OutOfMemoryError o StackOverflowError.*/
        public class ErrorExample {

            public static void main(String[] args) {
                int[] arreglo = new int[Integer.MAX_VALUE]; 
                // Intentamos crear un arreglo muy grande
                System.out.println("Arreglo creado exitosamente.");
            }
        }

    }
}
