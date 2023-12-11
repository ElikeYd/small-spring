package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 根据给定的名称和类型获取Bean对象。
     *
     * @param name          Bean的名称
     * @param requiredType  Bean的类型
     * @param <T>           泛型类型参数，表示返回的Bean对象的类型
     * @return              返回与给定名称和类型匹配的Bean对象
     * @throws BeansException  如果无法获取Bean对象，则抛出BeansException异常
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
