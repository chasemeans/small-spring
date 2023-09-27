package xyz.meetcat.springframework.beans.factory;

import xyz.meetcat.springframework.BeansException;

public interface  BeanFactory {
    Object getBean(String name) throws BeansException;
}
