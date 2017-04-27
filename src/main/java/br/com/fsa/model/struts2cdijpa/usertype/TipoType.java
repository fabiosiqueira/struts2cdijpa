package br.com.fsa.model.struts2cdijpa.usertype;

import br.com.fsa.model.struts2cdijpa.type.Tipo;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.descriptor.sql.IntegerTypeDescriptor;

/**
 *
 * @author Fabio Siqueira
 * @date 27/04/2017
 */
public class TipoType extends AbstractSingleColumnStandardBasicType<Tipo> {

    public static TipoType INSTANCE = new TipoType();
    public static final String TYPE = "br.com.fsa.model.struts2cdijpa.usertype.TipoUserType";
    private static final IntegerType INTEGER = new IntegerType();

    public TipoType() {
        super(IntegerTypeDescriptor.INSTANCE, TipoJavaTypeDescriptor.INSTANCE);
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean registerUnderJavaType() {
        return true;
    }

}
