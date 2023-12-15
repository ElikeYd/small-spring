package cn.bugstack.springframework.beans.factory;

/**
 * Callback that allows a bean to be aware of the bean
 * {@link ClassLoader class loader}; that is, the class loader used by the
 * present bean factory to load bean classes.
 *
 *
 *
 *
 *
 * ClassLoader的作用：将外部字节码文件加载成java类
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}


    