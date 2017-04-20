package br.com.fsa.model.struts2cdijpa.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Fabio
 * @param <T> Classe Da Entidade
 * @param <ID> Classe do ID da Entidade
 */
public class DAO<T, ID> implements Serializable {

    private final Class<T> classe;
    @Inject
    private EntityManager em;

    public DAO(Class<T> classe) {
        this.classe = classe;
    }

    public DAO() {
        this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void adiciona(T obj) {
        em.persist(obj);
    }

    public void remove(T obj) {
        em.remove(obj);
    }

    public void atualiza(T obj) {
        em.merge(obj);
    }

    public List listaTodos() {
        CriteriaQuery query = em.getCriteriaBuilder().createQuery(classe);
        query.from(classe);
        return em.createQuery(query).getResultList();
    }

    public T buscaPorId(ID id) {
        return em.find(classe, id);
    }
}
