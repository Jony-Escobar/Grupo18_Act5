import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ConversorDeMonedaTest.class,
        CotizacionTest.class,
        DolaritosTest.class
})
public class MiCoinSuite {
    // Esta clase se usa solo como contenedor de anotaciones para ejecutar todas las pruebas
}
