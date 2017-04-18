package br.com.fsa.model.struts2cdijpa.cdi;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Fabio
 */
@ApplicationScoped
public class LoggerManager implements Serializable {

    private final Logger logger = LogManager.getLogger("Struts2CDIJPA Logger");

    public void info(String info) {
        logger.info(info);
    }

    public void debug(String debug) {
        logger.debug(debug);
    }

    public void error(String error, Throwable e) {
        logger.error(error, e);
    }
}
