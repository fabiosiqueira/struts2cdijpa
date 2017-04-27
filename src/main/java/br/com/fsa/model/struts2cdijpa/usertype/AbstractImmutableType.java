/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsa.model.struts2cdijpa.usertype;

import java.io.Serializable;
import org.hibernate.usertype.UserType;

/**
 *
 * @author Fabio Siqueira
 * @date 27/04/2017
 */
public abstract class AbstractImmutableType implements UserType {

    public AbstractImmutableType() {
        super();
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object value) {
        return (Serializable) value;
    }

    @Override
    public Object assemble(Serializable cached, Object owner) {
        return cached;
    }

    @Override
    public Object deepCopy(Object value) {
        return value;
    }

    @Override
    public Object replace(Object original, Object target,
            Object owner) {
        return original;
    }

    @Override
    public boolean equals(Object x, Object y) {
        if (x != null && y != null) {
            return x.equals(y);
        }
        // Two nulls are equal as well
        return x == null && y == null;
    }

    @Override
    public int hashCode(Object x) {
        if (x != null) {
            return x.hashCode();
        }
        return 0;
    }
}
