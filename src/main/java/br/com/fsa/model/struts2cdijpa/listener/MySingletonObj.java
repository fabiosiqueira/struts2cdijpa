package br.com.fsa.model.struts2cdijpa.listener;

import br.com.fsa.model.struts2cdijpa.entity.TabelaTeste1;
import br.com.fsa.model.struts2cdijpa.type.Tipo;
import java.io.Serializable;
import java.util.Calendar;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Fabio
 */
@Singleton
public class MySingletonObj implements Serializable {

    @Inject
    private Logger log;
//    @Inject
//    private Instance<MyResquestObject> myRequestFactory;
    @Inject
    private EntityManager em;

    @Transactional
    public void exec() {
//        MyResquestObject my = myRequestFactory.get();
//        my.achou();

//
        em.joinTransaction();
        TabelaTeste1 teste = em.find(TabelaTeste1.class, 1);
        if (teste == null) {
            teste = new TabelaTeste1();
        }
        teste.setNome("Fabio");
        teste.setData(Calendar.getInstance());
        teste.setTipo(Tipo.TIPO2);
        em.persist(teste);

    }

}
