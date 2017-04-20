/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsa.model.struts2cdijpa.cdi;

import br.com.fsa.model.struts2cdijpa.dao.DAO;
import java.lang.reflect.ParameterizedType;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author Fabio
 */
public class DAOProducer {

    @Produces
    public DAO create(InjectionPoint injectionPoint) throws ClassNotFoundException {
        ParameterizedType type = (ParameterizedType) injectionPoint.getType();
        Class classe = (Class) type.getActualTypeArguments()[0];
        return new DAO(classe);
    }
}
