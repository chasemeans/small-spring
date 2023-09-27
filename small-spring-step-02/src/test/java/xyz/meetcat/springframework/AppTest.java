package xyz.meetcat.springframework;

import junit.framework.TestCase;
import xyz.meetcat.springframework.beans.factory.config.BeanDefinition;
import xyz.meetcat.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public static void main(String[] args) throws Exception{

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        factory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) factory.getBean("userService");

        userService.queryUserInfo();

        UserService userService_singleton = (UserService) factory.getBean("userService");

        userService_singleton.queryUserInfo();

    }
}
