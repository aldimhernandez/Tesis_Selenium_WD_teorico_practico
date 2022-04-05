package results.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * Dada la importancia que tiene poder desacoplar la definición del test del entorno sobre el
 * cual se ejecuta, uno de los atributos de la clase FirefoxExecution es un objeto de tipo
 * EnvironmentTest.
 * La clase EnvironmentTest es la encargada de proporcionar la información que necesita el
 * TestCase para conocer las condiciones sobre las que se ejecutará, con la ventaja de que este
 * proceso se producirá en tiempo de ejecución.*/

public class EnvironmentTest {
    //Attributes
    private FirefoxProfile firefoxProfile;
    private FirefoxBinary firefoxBinary;
    private String dirResults;
    public WebDriver driver; //Agregado por Aldana Hernández

    //Constructor
    public EnvironmentTest(FirefoxBinary binary, FirefoxProfile profile, String dir) {}

    //Methods
    //Getters and setters
    /** Método para obtener el objeto WebDriver que controla la interacción con el navegador web.
     * Se devuelve un objeto de tipo WebDriver caracterizado por los atributos firefoxBinary y
     * firefoxProfile.*/
    public WebDriver getDriver() {
        return driver;
    }

    /** Método que devuelve la dirección del directorio donde se guardan los resultados de la
     * ejecución.*/
    public String getDirResults() {
        return dirResults;
    }

    /** Método para establecer la dirección del directorio donde guardar los resultados de
     * ejecución. Params: - dir: Objeto de tipo <String> que indica el directorio donde guardar los
     * resultados de ejecución. */
    public void setDirResults() {}

    /** Método que establece que versión (archivo ejecutable) del navegador Firefox soportará la
     * ejecución de los tests. Params: - binary: Objeto de tipo <FirefoxBinary> que representa el
     * fichero ejecutable de la versión del navegador Firefox que se utilizará durante la
     * ejecución de los tests.*/
    public void setFirefoxBinary() {}

    /** Método que establece el perfil del navegador que utilizará Firefox durante la ejecución
     * de los tests. Params: - profile: Objeto de tipo <FirefoxProfile> que representa el perfil del
     navegador Firefox que se utilizará durante la ejecución de los tests.*/
    public void setFirefoxProfile() {}
}
