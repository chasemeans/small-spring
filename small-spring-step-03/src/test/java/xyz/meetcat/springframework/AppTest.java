package xyz.meetcat.springframework;

import junit.framework.TestCase;
import xyz.meetcat.springframework.beans.factory.config.BeanDefinition;
import xyz.meetcat.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public static void main(String[] args) throws Exception{

        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "test");
        userService.queryUserInfo();

    }
}
