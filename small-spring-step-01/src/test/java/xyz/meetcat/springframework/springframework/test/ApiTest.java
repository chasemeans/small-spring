package xyz.meetcat.springframework.springframework.test;

import xyz.meetcat.springframework.springframework.BeanDefinition;
import xyz.meetcat.springframework.springframework.BeanFactory;

public class ApiTest {


    public static void main(String[] args) {


        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        BeanFactory factory = new BeanFactory();

        factory.register("userService", beanDefinition);

        UserService userService = (UserService) factory.getBean("userService");

        userService.getInfo();
    }
}
