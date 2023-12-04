package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        //更改为方法拦截器回调函数，实现日志记录功能
        /*enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });*/
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println(beanName+"实例化成功了！");
                return methodProxy.invokeSuper(o, args);
            }
        });
        //实例化没有构造函数的对象
        if (null == ctor) return enhancer.create();
        //通过调用enhancer.create(ctor.getParameterTypes(), args)方法，使用指定的构造函数和参数来创建代理对象。
        // 这将调用构造函数，并使用传入的参数来实例化对象
        return enhancer.create(ctor.getParameterTypes(), args);
    }

}
