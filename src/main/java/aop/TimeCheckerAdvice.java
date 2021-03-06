package aop;

import java.lang.reflect.Method;

/**
 * Created by HL on 17/9/14.
 * AOP Advice implementation
 */
public class TimeCheckerAdvice implements Advice {

    private long beginTime;

    public void before(Method method) {
        System.out.println("-----before " + method.getName() + "--------");
        beginTime = System.currentTimeMillis();
    }

    public void after(Method method) {
        System.out.println("------after " + method.getName() + "--------");
        long endTime = System.currentTimeMillis();
        System.out.println("Take time of " + (endTime - beginTime));
    }
}
