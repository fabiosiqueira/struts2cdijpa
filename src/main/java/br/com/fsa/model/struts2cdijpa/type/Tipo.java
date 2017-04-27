package br.com.fsa.model.struts2cdijpa.type;

import java.io.Serializable;

/**
 *
 * @author Fabio Siqueira
 * @date 27/04/2017
 */
public enum Tipo implements Serializable {
    TIPO0(10),
    TIPO1(20),
    TIPO2(30);
    private int value;

    Tipo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Tipo valueOf(Integer v) {
        for (Tipo val : values()) {
            if (val.getValue() == v) {
                return val;
            }
        }
        return null;
    }
}
