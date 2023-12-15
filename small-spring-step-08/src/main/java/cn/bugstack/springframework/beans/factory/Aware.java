package cn.bugstack.springframework.beans.factory;

/**
 * aware ： "意识到的" 或者 "知道的"
 * 标记类接口，实现该接口可以被Spring容器感知
 * <p>
 * Marker superinterface indicating that a bean is eligible to be
 * notified by the Spring container of a particular framework object
 * through a callback-style method.  Actual method signature is
 * determined by individual subinterfaces, but should typically
 * consist of just one void-returning method that accepts a single
 * argument.
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface Aware {
}
                             