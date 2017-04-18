package br.com.fsa.model.struts2cdijpa.action;

import br.com.fsa.model.struts2cdijpa.cdi.Manager;
import br.com.fsa.model.struts2cdijpa.entity.TabelaTeste;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.inject.Inject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Fabio
 */
@Result(location = "index.jsp")
public class IndexAction extends ActionSupport {

    @Inject
    private Manager manager;
    private List<TabelaTeste> lista;

    @Override
    @Action(value = "index")
    public String execute() {
        return SUCCESS;
    }

    public List<TabelaTeste> getLista() {
        lista = manager.listar();
        return lista;
    }

}
