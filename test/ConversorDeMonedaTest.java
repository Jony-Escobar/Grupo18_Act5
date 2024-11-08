import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ConversorDeMonedaTest {

    private static ConversorDeMoneda conversor;

    @BeforeClass
    public static void init() {
        conversor = new ConversorDeMoneda(500);
        System.out.println("Bienvenido al test de ConversorDeMoneda");
    }

    @Before
    public void beforeEach() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testConvertir() {
        assertEquals(1200, conversor.convertir(1000, 1.2), 0.001);
    }

    @Test
    public void testCalcularCotizacion() {
        assertEquals(0.9, conversor.calcularCotizacion(1620, 1800), 0.001);
    }

    @Test
    public void testAumentarSaldo() {
        conversor.aumentarSaldo(100);
        assertEquals(600, conversor.getSaldo(), 0.001);
    }

    @Test
    public void testRetirarDolarFisico() {
        conversor.setSaldo(2100);
        conversor.retirarDolarFisico(2000);
        assertEquals(100, conversor.getSaldo(), 0.001);
    }

    @After
    public void afterEach() {
        System.out.println("Prueba finalizada, campos en 0");
        conversor.setSaldo(0);  // Reset para cada prueba
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("La operación ha finalizado");
    }
}
