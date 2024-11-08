# Grupo18_Act5
 Testing/Junit4/Java8/Ntbns12.6



ACTIVIDAD 5: Usando JUnit en NetBeans
1. Realizar la clase java Conversor de Moneda que permite por el
momento, realizar las cuatro operaciones convertir una moneda en
otra (1000$ * 1200 U$S), calcular cotización (si me dan 1620U$S por
$1800000, a cuanto cotiza?), aumentar saldos (en mi cuenta tengo
U$S500, actualizo lo comprado), si luego retiro dólar físico como
queda (es decir, extraigo en billetes de U$S 100, los U$S2100 que tengo)
2. Crear la clase Junit desde NetBeans conversorTest, que pone a prueba la
clase anterior usando las anotaciones correspondientes
3. Use la anotación @Test y assertEquals para testear la resta y la suma use un delta de 0.001
4. Use las annotation @BeforeClass para inicializar (new) el calculador y mostrar mensaje de
bienvenida. Utilice las annotations:
5. @Before antes de cada método, que muestre un mensaje de la operación que se testea
Use System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
6. @After para que luego de cada método testeado que diga "Prueba finalizada, campos en 0”.
7. Coloque un @AfterClass luego, que nos indique que “la operación ha finalizado”.
8. En otro archivo cotizacionTest, cree el método testCotizarCero use @Test (expected) que lance
una AritmethicException.
9. En un tercer archivo dolaritosTest, cree una prueba parametrizada con el método
testCotizarCero. Use @RunWith(value=Parameterized.class) e Iterable<Object[]> tomarDatos
previo @Parameters para la suma usando conjuntos de valores como ej: 180000, 1500, 120,
120000, 0, error, y 100000, -900, 111,11. Devuelva Arrays.asList(new Object[][] {{ x,x,x}{x,x,x}}).
10. Cree un Test Suite ‘miCoinSuite’, que ejecute en orden los 3 árboles de pruebas, tendrá un
@RunWith(Suite.class) @Suite.SuiteClasses({paquete.ejemploTest.class,
paquete.ejemploTest.class })
NOTA: Puedes basarte en el ejemplo del profesor:
1. En la clase profesor calcular la carga horaria que tiene a partir de la cantidad de horas
ingresadas en sus tres materias que imparte.
2. Simular el trabajo de los docentes que atienden un curso actual, ingresando la cantidad de
alumnos que siguen en carrera y los profes designados para corregir. Entonces si hay 32
cursantes, y se anotan 4 profes, le toca un total de 8 alumnos a cada uno.
