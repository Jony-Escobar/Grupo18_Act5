import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DolaritosTest {

    private final double recibido;
    private final double cantidadDada;
    private final double expectedCotizacion;
    private final ConversorDeMoneda conversor = new ConversorDeMoneda(0);

    public DolaritosTest(double recibido, double cantidadDada, double expectedCotizacion) {
        this.recibido = recibido;
        this.cantidadDada = cantidadDada;
        this.expectedCotizacion = expectedCotizacion;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{
            {180000, 1500, 120},
            {120000, 0, Double.POSITIVE_INFINITY}, // Ajuste para evitar error
            {100000, -900, -111.11}
        });
    }

    @Test
    public void testCotizar() {
        assertEquals(expectedCotizacion, conversor.calcularCotizacion(recibido, cantidadDada), 0.001);
    }
}
