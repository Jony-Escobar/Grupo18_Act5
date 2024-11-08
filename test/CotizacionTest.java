import org.junit.Test;

public class CotizacionTest {

    private ConversorDeMoneda conversor = new ConversorDeMoneda(0);

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        conversor.calcularCotizacion(1620, 0);
    }
}
