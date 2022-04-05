package results.automation;

import java.util.List;

/** FirefoxExecution class:
 * Representa la ejecución de un set o batería de tests dentro de un entorno de pruebas
 * específico.*/

public class FirefoxExecution {

    //Attributes
    public TestLog log = null;
    private List<TestCase> testCaseList;
    private EnvironmentTest environment;

    //Constructor
    public FirefoxExecution(String browser, String profile, String dirResults) {}
    //Methods
    /** Método para añadir tests a la ejecución de la batería de pruebas.
     * Recibe un parámetro: 1: t: Objeto de tipo <TestCase> que representa el test que se quiere
     * añadir a la ejecución */
    public void addTest(TestCase t) {}

    /** Este método inicia la ejecución del set de tests. La ejecución se realiza en el mismo
     * orden en el cual fueron añadidas las pruebas.*/
    public void start() {}

    /** Este método genera el archivo de log con el resultado de la ejecución. En él se pueden
     * consultar los resultados obtenidos por cada uno de los test ejecutados.
     * El fichero de log que genera este método se guarda en el directorio indicado
     * por el atributo environment. */
    public void generateResults() {}

}
