/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsa.model.struts2cdijpa.usertype;

import br.com.fsa.model.struts2cdijpa.type.Tipo;
import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.IntegerTypeDescriptor;

/**
 *
 * @author Fabio Siqueira
 * @date 27/04/2017
 */
public class TipoJavaTypeDescriptor extends AbstractTypeDescriptor<Tipo> {

    public static final TipoJavaTypeDescriptor INSTANCE = new TipoJavaTypeDescriptor();

    public TipoJavaTypeDescriptor() {
        super(Tipo.class);
    }

    @Override
    public String toString(Tipo value) {
        return value == null ? null : value.name();
    }

    @Override
    public Tipo fromString(String string) {
        return string == null ? null : Tipo.valueOf(string);
    }

    @Override
    public <X> X unwrap(Tipo value, Class<X> type, WrapperOptions options) {
        return IntegerTypeDescriptor.INSTANCE.unwrap(
                value == null ? null : value.getValue(),
                type,
                options);
    }

    @Override
    public <X> Tipo wrap(X value, WrapperOptions options) {
        return Tipo.valueOf(IntegerTypeDescriptor.INSTANCE.wrap(value, options));
    }

}
