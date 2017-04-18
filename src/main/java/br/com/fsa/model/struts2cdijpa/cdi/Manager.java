package br.com.fsa.model.struts2cdijpa.cdi;

import br.com.fsa.model.struts2cdijpa.annotations.TransactionDebugger;
import br.com.fsa.model.struts2cdijpa.entity.TabelaTeste;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 *
 * @author Fabio
 */
@RequestScoped
public class Manager implements Serializable {

    @Inject
    private EntityManager em;

    @Transactional
    @TransactionDebugger
    public void salvar(String nome) {
        TabelaTeste t = new TabelaTeste();
        t.setData(Calendar.getInstance());
        t.setNome(nome);
        em.persist(t);
    }

    public TabelaTeste buscar(Integer id) {
        TabelaTeste t = em.find(TabelaTeste.class, id);
        return t;
    }

    public List<TabelaTeste> listar() {
        return em.createQuery("From TabelaTeste").getResultList();
    }
}
