package xyz.meetcat.springframework.beans.factory;

import xyz.meetcat.springframework.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;


    Object getBean(String name, Object... args) throws BeansException;
}
