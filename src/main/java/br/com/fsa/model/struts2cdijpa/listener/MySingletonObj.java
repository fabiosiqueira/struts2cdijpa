package br.com.fsa.model.struts2cdijpa.listener;

import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Fabio
 */
@Singleton
public class MySingletonObj implements Serializable {

    @Inject
    private Logger log;

    void exec() {
        log.info("Teste executando funcao chamada em um Weblistener. (Não funciona com @RequestScoped)");
    }

}
