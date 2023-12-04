package cn.bugstack.springframework.beans.factory.config;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 *
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例bean
     * @param beanName bean的名字
     * @return 单例bean
     */
    Object getSingleton(String beanName);

}
