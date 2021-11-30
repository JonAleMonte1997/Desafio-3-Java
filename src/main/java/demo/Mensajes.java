package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mensajes {
	
	final static Logger logger = LogManager.getLogger(Mensajes.class);
	
	public void logFatal(String causa) {
		logger.fatal("FATAL ERROR: " + causa);
	}
	
	public void logDebug(String mensaje) {
		logger.debug(mensaje);
	}
	
	public void logWarn(String causa) {
		logger.debug("Alerta: " + causa);
	}
	
	public void logError(String causa) {
		logger.error("ERROR: " + causa);
	}
}
