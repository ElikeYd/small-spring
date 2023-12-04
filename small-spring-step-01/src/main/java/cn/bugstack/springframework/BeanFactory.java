package cn.bugstack.springframework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class BeanFactory {
    /**
     * 存放bean元信息的容器，此时还不是一个bean对象；key是类名或指定的bean名字，value是BeanDefinition(这个bean的信息)
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }


}
