package beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("-------------postProcessBeanFactory---------");
        BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition("person");
         bd.getPropertyValues().addPropertyValue("name", "110");
    }
}
