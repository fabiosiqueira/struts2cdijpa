package br.com.fsa.model.struts2cdijpa.cdi;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Fabio
 */
@ApplicationScoped
public class EntityManagerProducer implements Serializable {

    @PersistenceUnit(unitName = "modelPU")
    private EntityManagerFactory emf;
    @Inject
    private Logger logger;

    @Produces
    @Dependent
    public EntityManager gerarEM() {
        logger.info("Abrindo Entity Manager");
        return emf.createEntityManager();
    }

    public void disposeEM(@Disposes EntityManager em) {
        logger.info("Fechando EntityManager");
        em.close();
    }
}
