package xyz.meetcat.springframework.beans.factory.support;

import xyz.meetcat.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
