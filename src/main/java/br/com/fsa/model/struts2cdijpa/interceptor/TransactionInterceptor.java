package br.com.fsa.model.struts2cdijpa.interceptor;

import br.com.fsa.model.struts2cdijpa.annotations.TransactionDebugger;
import br.com.fsa.model.struts2cdijpa.cdi.LoggerManager;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Fabio Siqueira
 */
@Interceptor
@TransactionDebugger
public class TransactionInterceptor {

    @Inject
    private LoggerManager logger;

    @AroundInvoke
    public Object runInTransaction(InvocationContext invocationContext) throws Exception {
        Object result = null;
        try {
            result = invocationContext.proceed();
        } catch (Exception e) {
            logger.error("Error TransactionInterceptor", e);
            throw e;
        }
        return result;
    }
}
