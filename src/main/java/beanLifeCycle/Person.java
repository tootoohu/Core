package beanLifeCycle;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean{

    private String name;

    private String address;

    private BeanFactory beanFactory;

    private String beanName;

    private Identifier identifier;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public Person(){
        System.out.println("constructor is invoked!!");
    }

    public Person(Identifier identifier){
        this.identifier = identifier;
        System.err.println("constructor Person(Identifier identifier) is invoked");
    }

    public void setName(String name) {
        System.err.println("Person set name " + name);
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.err.println("Person setBeanFactory " + beanFactory.toString());
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {

        System.err.println("Person setBeanName " + s);
        this.beanName = s;
    }

    public void destroy() throws Exception {

        System.err.println("Person destroy " + this.name);

    }

    public void afterPropertiesSet() throws Exception {
        System.err.println("Person afterPropertiesSet ");

    }

    public void myInit(){
        System.err.println("Person init-method");
    }
    public void myDestroy(){
        System.err.println("Person destroy-method");
    }

}
