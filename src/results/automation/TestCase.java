package results.automation;

import org.opentest4j.AssertionFailedError;

/** Project:
 * Modelo de automatización de pruebas con Selenium WebDriver siguiendo los pasos de (nombre del
 * libro, autores, año)
 * @author : María Aldana Hernández
 *
 * TestCase class:
 * Se define de manera estándar la entidad que representa a un test.
 * Esta clase define el modelo genérico de un caso de prueba. Las diferentes pruebas automáticas
 * estarán representadas por ella.
 * Es abstracta y define el patrón que deberán tener todos los casos de prueba, cualquier test
 * debe heredar de esta clase.
 * */
public abstract class TestCase {

    /**
     * Método que prepara las precondiciones necesarias para la ejecución del test, estableciendo la
     * configuración y el entorno en el cual se ejecutará la prueba. Recibe dos parámetros: 1:
     * environment de tipo <EnvironmentTest> que contiene información sobre el tipo de ejecución; 2:
     * log de tipo <TestLog> que permite que el test pueda registrar información de log durante su
     * ejecución. Si detecta cualquier problema durante su ejecución, este método, lanza una
     * excepción del tipo <FailedTest>
     */

    public void setUp(EnvironmentTest environment, TestLog log) throws AssertionFailedError {

    }

    /**
     * Método que define las acciones que ira realizando la prueba
     * Si durante su ejecución, este método, se encuentra con algún resultado no esperado lanza una
     * excepción del tipo <FailedTest>
     * */
    public void run() throws AssertionFailedError {

    }

    /**
     * Método que realiza las acciones necesarias después de la ejecución de una prueba.
     * Por ejemplo, acciones que liberen recursos luego de finalizado el test, acciones que
     * realicen la generación de resultados, etc.
     * */
    public void tearDown() {

    }
}
