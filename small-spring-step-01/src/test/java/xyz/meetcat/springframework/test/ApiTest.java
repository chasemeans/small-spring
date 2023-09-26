package xyz.meetcat.springframework.test;

import xyz.meetcat.springframework.BeanDefinition;
import xyz.meetcat.springframework.BeanFactory;

public class ApiTest {


    public static void main(String[] args) {


        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        BeanFactory factory = new BeanFactory();

        factory.register("userService", beanDefinition);

        UserService userService = (UserService) factory.getBean("userService");

        userService.getInfo();
    }
}
