public class ej24 {
    public static void main(String[] args) {
        int horas = 0, minutos = 0, segundos = 0;

        while (true) {
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

            try {
                Thread.sleep(1000); // Esperar 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }

            if (minutos == 60) {
                minutos = 0;
                horas++;
            }

            if (horas == 24) {
                horas = 0;
            }
        }
    }
}
