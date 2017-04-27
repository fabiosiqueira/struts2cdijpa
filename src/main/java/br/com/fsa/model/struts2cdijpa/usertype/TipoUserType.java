package br.com.fsa.model.struts2cdijpa.usertype;

import br.com.fsa.model.struts2cdijpa.type.Tipo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.IntegerType;

/**
 *
 * @author Fabio Siqueira
 * @date 27/04/2017
 */
public class TipoUserType extends AbstractImmutableType {

    public static final String TYPE = "br.com.fsa.model.struts2cdijpa.usertype.TipoUserType";
    private static final IntegerType INTEGER = new IntegerType();

    public TipoUserType() {
        super();
    }

    @Override
    public int[] sqlTypes() {
        return new int[]{INTEGER.sqlType()};
    }

    @Override
    public Class returnedClass() {
        return Tipo.class;
    }
//
//    @Override
//    public boolean isMutable() {
//        return false;
//    }
//
//    @Override
//    public Object deepCopy(Object value) throws HibernateException {
//        return value;
//    }
//
//    @Override
//    public Serializable disassemble(Object value) throws HibernateException {
//        return (Serializable) value;
//    }
//
//    @Override
//    public Object assemble(Serializable cached, Object owner) throws HibernateException {
//        return cached;
//    }
//
//    @Override
//    public Object replace(Object original, Object target, Object owner) throws HibernateException {
//        return original;
//    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] names, SharedSessionContractImplementor ssci, Object owner) throws HibernateException, SQLException {

        Integer i = resultSet.getInt(names[0]);
        if (resultSet.wasNull()) {
            return null;
        }
        return Tipo.valueOf(i);

    }

    @Override
    public void nullSafeSet(PreparedStatement statement, Object value, int index, SharedSessionContractImplementor ssci) throws HibernateException, SQLException {

        if (value == null) {
            statement.setNull(index, INTEGER.sqlType());
        } else {
            Tipo tipo = (Tipo) value;
            statement.setInt(index, tipo.getValue());
        }

    }

//    @Override
//    public boolean equals(Object x, Object y) throws HibernateException {
//        if (x == y) {
//            return true;
//        }
//        if (x == null || y == null) {
//            return false;
//        }
//        return x.equals(y);
//    }
//
//    @Override
//    public int hashCode(Object x) throws HibernateException {
//        return x.hashCode();
//    }
}
