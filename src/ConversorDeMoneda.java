public class ConversorDeMoneda {

    private double saldo;

    public ConversorDeMoneda(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Convertir moneda
    public double convertir(double monto, double tasaCambio) {
        return monto * tasaCambio;
    }

    // Calcular cotizacion
    public double calcularCotizacion(double recibido, double cantidadDada) {
        if (cantidadDada == 0) {
            throw new ArithmeticException("División por cero al calcular la cotización");
        }
        return recibido / cantidadDada;
    }

    // Aumentar saldo
    public void aumentarSaldo(double cantidad) {
        this.saldo += cantidad;
    }

    // Retiro de dinero físico en multiplos de 100
    public void retirarDolarFisico(double cantidad) {
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
