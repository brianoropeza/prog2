public class ej23 {
    public static void main(String[] args) {
        double primerPago = 10.0;
        double ratio = 2.0; // Duplica el pago cada mes

        double totalPagado = calcularTotalPagado(primerPago, ratio, 20);
        double pagoMensual = calcularPagoMensual(primerPago, ratio);

        System.out.println("El pago mensual es: " + pagoMensual + " euros.");
        System.out.println("El total pagado después de 20 meses es: " + totalPagado + " euros.");
    }

    public static double calcularPagoMensual(double primerPago, double ratio) {
        double pagoMensual = primerPago;
        for (int i = 2; i <= 20; i++) {
            pagoMensual *= ratio;
        }
        return pagoMensual;
    }

    public static double calcularTotalPagado(double primerPago, double ratio, int meses) {
        double totalPagado = 0;
        double pagoActual = primerPago;
        for (int i = 0; i < meses; i++) {
            totalPagado += pagoActual;
            pagoActual *= ratio;
        }
        return totalPagado;
    }
}
