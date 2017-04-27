
import br.com.fsa.model.struts2cdijpa.usertype.TipoUserType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabio Siqueira
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        String className = "br.com.fsa.model.struts2cdijpa.usertype.TipoUserType";
        
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
////        WebappClassLoader classLoader1 = new WebappClassLoader();
//        Class clazz = classLoader.loadClass(className);
//
//        System.out.println(UserType.class.isAssignableFrom(clazz));
        System.out.println(TipoUserType.class.toString());
        System.out.println(TipoUserType.class.toGenericString());
        System.out.println(TipoUserType.class.getName());
        System.out.println(TipoUserType.class.getCanonicalName());
        System.out.println(TipoUserType.class.getSimpleName());
        System.out.println(TipoUserType.class.getTypeName());
        
//Thread.
//        DefaultWorkerThread dwt = new DefaultWorkerThread();
//        classLoader = Thread.currentThread().getContextClassLoader();
//        clazz = classLoader.loadClass(className);
//
//        System.out.println(UserType.class.isAssignableFrom(clazz));
    }

}
