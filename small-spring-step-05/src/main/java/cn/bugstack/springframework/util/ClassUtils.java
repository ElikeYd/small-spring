package cn.bugstack.springframework.util;

public class ClassUtils {

    /**
     * 获取默认的类加载器。
     *
     * @return 默认的类加载器
     */
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }
        catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl =ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}
