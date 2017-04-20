package br.com.fsa.model.struts2cdijpa.cdi;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Fabio
 */
@Dependent
public class LoggerProducer implements Serializable {

    @Produces
    public Logger createLogger(InjectionPoint injectionPoint) {

        return LogManager.getLogger(injectionPoint.getMember().getDeclaringClass().getName());

    }
}
