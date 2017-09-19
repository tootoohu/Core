package bean;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean{

    private String name;

    private String address;

    private BeanFactory beanFactory;

    private String beanName;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public Person(){
        System.out.println("constructor is invoked!!");
    }

    public void setName(String name) {
        System.out.println("set name " + name);
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory " + beanFactory.toString());
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {

        System.out.println("setBeanName " + s);
        this.beanName = s;
    }

    public void destroy() throws Exception {

        System.out.println("destroy " + this.name);

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet ");

    }

    public void myInit(){
        System.out.println("init-method");
    }
    public void myDestroy(){
        System.out.println("destroy-method");
    }

}
