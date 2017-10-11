package beanCreation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanCreation/bean.xml");
        User user = (User)context.getBean("user");

        User staticuser = (User)context.getBean("staticuser");
        System.out.println(staticuser);
    }
}
