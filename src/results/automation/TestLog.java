package results.automation;

import java.util.List;

/** TestLog Class
 * Ofrece un servicio de registro de mensajes de log para que los diferentes tests puedan ir
 * grabando información relacionada con su ejecución. Esta información posteriormente puede ser
 * guardada en un fichero. */

public class TestLog {

    //Attributes
    private List<String> dataLog;
    private boolean consoleFlag = false;

    //Constructor
    public TestLog() {}

    //Methods, getters and setters
    /** Método que permite activar o desactivar los logs por consola. Este método modifica el
     * valor del atributo consoleFlag. Params: - consoleFlag: Objeto de tipo <boolean> que indica
     * si se desea mostrar o no por consola, los mensajes de log registrados por el objeto
     * TestLog.*/
    public void setConsoleFlag(boolean consoleFlag) {}

    /** Este método es el encargado de registrar un mensaje de log. Para ello, es
     necesario que se le indique el mensaje a registrar y el autor o fuente de
     dicho mensaje. Params: 1. sourceLog: Objeto que quiere registrar un mensaje de log. Por
     ejemplo, podría ser un objeto de tipo Testcase que necesita registrar algún mensaje de
     log durante su ejecución. 2. logMsg: Objeto de tipo <String> que representa el mensaje (la
     información) a registrar.*/
    public void addLog(Object sourceLog, String logMsg) {}

    /** Método que devuelve toda la información de log registrada hasta el momento en
     el cual se invoca. La información se devuelve en un objeto de tipo <String>*/
    public String getDataLog() {
        return null;
    }

    /** Método que guarda en un fichero toda la información de log registrada hasta el momento en
     * el cual se invoca. El fichero donde se desea guardar la información de log se le pasa cómo
     * parámetro. Params: -* logFile: Objeto de tipo <String> que indica la localización del fichero
     * donde se desea guardar la información de log.*/
    public void saveLogFile(String logFile) {}
}