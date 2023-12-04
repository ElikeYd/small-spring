package cn.bugstack.springframework.beans.factory.config;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;

    /**
     * 构造一个BeanDefinition对象。
     *
     * @param beanClass Bean的类对象。
     */
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

}
