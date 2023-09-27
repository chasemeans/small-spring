package xyz.meetcat.springframework.beans.factory.support;

import xyz.meetcat.springframework.BeansException;
import xyz.meetcat.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public abstract class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<String, Object>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }


    protected void addSingleton(String beanName, Object obj) {
        singletonObjects.put(beanName, obj);
    }


}
