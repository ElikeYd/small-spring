package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * 创建bean的方法，根据给定的bean名称和bean定义,并使用线程安全的单例模式进行改造
     * @param beanName bean的名称
     * @param beanDefinition bean的定义
     * @return 创建的bean对象
     * @throws BeansException 如果bean实例化失败，则抛出BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = getSingleton(beanName);
        if (bean == null) {
            synchronized (beanDefinition.getBeanClass()) {
                bean = getSingleton(beanName);
                if (bean == null) {
                    try {
                        bean = beanDefinition.getBeanClass().newInstance();
                        addSingleton(beanName, bean);
                    } catch (Exception e) {
                        throw new BeansException("Failed to create bean instance", e);
                    }
                }
            }
        }
        return bean;
    }
}
