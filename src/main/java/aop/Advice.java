package aop;

import java.lang.reflect.Method;

/**
 * Created by HL on 17/9/14.
 * AOP advice interface which will be invoked before or after target method
 */
public interface Advice {

    public void before(Method method);

    public void after(Method method);
}
