package aop;

import java.lang.reflect.Proxy;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by HL on 17/9/11.
 * Create automatic class
 */
public class Test {

    public static void main(String[] args) throws Exception{

        Class clazzProxy = Proxy.getProxyClass(Collection.class.getClassLoader(),Collection.class);
        System.out.println(clazzProxy.getName());
        Constructor[] constructors = clazzProxy.getConstructors();
        for (Constructor c : constructors)
        {
            System.out.println(c.toString());
        }

        Method[] methods = clazzProxy.getMethods();
        for (Method m: methods){
            StringBuilder sb = new StringBuilder(m.getName());
            Class paraType[] = m.getParameterTypes();
            sb.append("(");

            for (Class type : paraType){

                sb.append(type.getName() + ",");
            }
            if(paraType.length != 0)
                sb.deleteCharAt(sb.length()- 1);
           sb.append(")");
            System.out.println(sb.toString());
        }

        InvocationHandler ih = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                return null;
            }
        };

        // get constructor
        Constructor c = clazzProxy.getConstructor(InvocationHandler.class);
        //get instance by constructor
        Collection collection = (Collection) c.newInstance(ih);
        System.out.println(collection.toString());

        Collection cProxy = (Collection) Proxy.newProxyInstance(Collection.class.getClassLoader(),
               new Class[]{Collection.class},
          new InvocationHandler(){

              // add the target object, must be the member of InvocationHandler
              List list = new ArrayList();

              public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                  return method.invoke(list, args);
              }
          });
        cProxy.add("1");
        System.out.println(cProxy.size());
    }

}
