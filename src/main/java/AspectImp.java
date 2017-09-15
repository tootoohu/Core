import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HL on 17/9/14.
 */
public class AspectImp {

    /*
       Get proxy, the target is the target object which need to be proxied, advice is the implementation method
     */
    public static Object getProxy(final Object target, final Advice advice){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before(method);
                        Object ret = method.invoke(target, args);
                        advice.after(method);
                        return ret;
                    }
                });

        return proxy;
    }

    public static void main(String[] args){
        List target = new ArrayList();

        List list = (List)AspectImp.getProxy(target, new TimeCheckerAdvice());
        list.add("hello");
        System.out.println(list.get(0));
    }


}
