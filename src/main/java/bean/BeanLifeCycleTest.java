package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanLifeCycleTest {

    public static void main(String[] args){

        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("bean/bean.xml");

        Person p = (Person)factory.getBean("person");

        System.out.println("close the container....");

        factory.registerShutdownHook();
    }

}
