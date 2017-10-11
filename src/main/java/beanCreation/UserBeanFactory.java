package beanCreation;

public class UserBeanFactory {

    //静态工厂方法
    public static User getUser(){
        return new User("guoguo");
    }

    //实例工厂
    public User getUserInstance(){
        return new User("hyy");
    }
}
