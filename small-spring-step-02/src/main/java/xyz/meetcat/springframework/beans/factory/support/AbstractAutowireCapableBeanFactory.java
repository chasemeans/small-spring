package xyz.meetcat.springframework.beans.factory.support;

import xyz.meetcat.springframework.BeansException;
import xyz.meetcat.springframework.beans.factory.config.BeanDefinition;

public class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {


    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        return null;
    }

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;

        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed");
        }
        addSingleton(beanName, bean);
        return bean;
    }




}
