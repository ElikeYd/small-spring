package cn.bugstack.springframework.context;

import java.util.EventListener;

/**
 * Interface to be implemented by application event listeners.
 * Based on the standard <code>java.util.EventListener</code> interface
 * for the Observer design pattern.
 *
 *
 *
 *
 *
 * 监听器
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.  ： 处理应用程序事件；也就是这个监听器监听到相应事件时执行相应的处理逻辑
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
