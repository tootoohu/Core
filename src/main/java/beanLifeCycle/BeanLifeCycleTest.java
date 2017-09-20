package beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class BeanLifeCycleTest {

    public static void main(String[] args){

        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beanLifeCycle/bean.xml");

        Environment env;

        Person p = (Person)factory.getBean("person");

        System.out.println("close the container....");

        factory.registerShutdownHook();
    }

}
