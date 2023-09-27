package xyz.meetcat.springframework.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {


    private Map<String, BeanDefinition> map = new ConcurrentHashMap<String, BeanDefinition>();


    public Object getBean(String beanName) {
        return map.get(beanName).getBean();
    }

    public void register(String beanName, BeanDefinition beanDefinition) {
        map.put(beanName, beanDefinition);

    }

}
