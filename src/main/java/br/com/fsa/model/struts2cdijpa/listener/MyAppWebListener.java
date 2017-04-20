package br.com.fsa.model.struts2cdijpa.listener;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Fabio
 */
@WebListener
public class MyAppWebListener implements ServletContextListener {

    @Inject
    private Logger log;
    @Inject
    private MySingletonObj mySingletonObj;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("App Inicializado - contextInitialized");
        mySingletonObj.exec();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("App Finalizado - contextDestroyed");
    }

}
