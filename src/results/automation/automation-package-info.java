package results.automation;

/** Automation Info:
 * Durante el diseño del modelo de automatización, se ha tenido en cuenta que una aplicación web
 * real debe ser capaz de ejecutarse correctamente en diferentes navegadores. Por ejemplo,
 * TestLink deberá funcionar para los navegadores más comunes, como pueden ser Chrome, IE,
 * Firefox, etc., y dentro de esos navegadores deberá ser compatible con sus diferentes versiones.
 * Por tanto, es necesario que las pruebas de la aplicación estén totalmente desacopladas del
 * entorno de ejecución, de forma que un mismo test pueda ser ejecutado sobre diferentes
 * navegadores de forma transparente para él.
 * */