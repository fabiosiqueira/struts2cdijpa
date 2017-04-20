package br.com.fsa.model.struts2cdijpa.cdi;

import br.com.fsa.model.struts2cdijpa.annotations.TransactionDebugger;
import br.com.fsa.model.struts2cdijpa.dao.TabelaTeste1DAO;
import br.com.fsa.model.struts2cdijpa.entity.TabelaTeste1;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 *
 * @author Fabio
 */
@RequestScoped
public class Manager implements Serializable {

    @Inject
    private TabelaTeste1DAO tabelaTeste1DAO;

    @Transactional
    @TransactionDebugger
    public void salvar(String nome) {
        TabelaTeste1 t = new TabelaTeste1();
        t.setData(Calendar.getInstance());
        t.setNome(nome);
        tabelaTeste1DAO.adiciona(t);
    }

    public TabelaTeste1 buscar(Integer id) {
        return tabelaTeste1DAO.buscaPorId(id);
    }

    public List<TabelaTeste1> listar() {
        return tabelaTeste1DAO.listaTodos();
    }

    @Transactional
    @TransactionDebugger
    public void apagar(Integer id) {
        tabelaTeste1DAO.remove(tabelaTeste1DAO.buscaPorId(id));
    }
}
