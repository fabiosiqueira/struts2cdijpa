/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsa.model.struts2cdijpa.usertype;

import br.com.fsa.model.struts2cdijpa.type.Tipo;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author Fabio Siqueira
 * @date 27/04/2017
 */
@Converter
public class TipoConverter implements AttributeConverter<Tipo, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Tipo value) {
        if (value == null) {
            return null;
        }

        return value.getValue();
    }

    @Override
    public Tipo convertToEntityAttribute(Integer value) {
        if (value == null) {
            return null;
        }

        return Tipo.valueOf(value);
    }

}
