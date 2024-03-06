import java.util.Random;

public class ej30 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];

        // Generar números aleatorios entre 100 y 999
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(900) + 100;
            }
        }

        // Calcular sumas parciales de filas y columnas
        int[] sumasFilas = new int[4];
        int[] sumasColumnas = new int[5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumasFilas[i] += matriz[i][j];
                sumasColumnas[j] += matriz[i][j];
            }
        }

        // Mostrar sumas parciales de filas
        System.out.println("Sumas parciales de filas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumasFilas[i]);
        }

        // Mostrar sumas parciales de columnas
        System.out.println("Sumas parciales de columnas:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumasColumnas[j]);
        }

        // Calcular suma total
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        // Mostrar suma total
        System.out.println("Suma total: " + sumaTotal);
    }
}
