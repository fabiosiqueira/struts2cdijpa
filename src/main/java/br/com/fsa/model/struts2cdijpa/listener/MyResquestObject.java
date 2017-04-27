package br.com.fsa.model.struts2cdijpa.listener;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Fabio Siqueira
 * @date 27/04/2017
 */
@RequestScoped
public class MyResquestObject {

    public void achou() {
        System.out.println("ACHOUUUUUUUUU");
    }

}
