package br.com.fsa.model.struts2cdijpa.action;

import br.com.fsa.model.struts2cdijpa.cdi.Manager;
import br.com.fsa.model.struts2cdijpa.entity.TabelaTeste1;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import java.util.List;
import javax.inject.Inject;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author Fabio
 */
@Results({
    @Result(name = "error", location = "index.jsp"),
    @Result(name = "input", location = "index.jsp"),
    @Result(name = "success", type = "redirectAction", location = "index")
})
public class IndexAction extends ActionSupport implements Preparable {

    @Inject
    private Manager manager;
    private List<TabelaTeste1> lista;
    private String nome;
    private Integer id;
    @Inject
    private Logger log;

    @Action(value = "index_apagar")
    public String apagar() {
        if (id != null) {
            log.info(id);
            manager.apagar(id);
        }
        return SUCCESS;
    }

    @Override
    @Action(value = "index_execute")
    public String execute() {
        if (nome != null) {
            log.info(nome);
            manager.salvar(nome);
        }
        return SUCCESS;
    }

    @Override
    @Action(value = "index")
    public String input() {
        return INPUT;
    }

    public List<TabelaTeste1> getLista() {
        return lista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void prepare() throws Exception {
        lista = manager.listar();
    }

}
