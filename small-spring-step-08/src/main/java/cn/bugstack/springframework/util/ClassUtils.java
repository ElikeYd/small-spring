package cn.bugstack.springframework.util;

public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            //获取当前线程的类加载器，ClassLoader的作用：可以将外部字节码文件加载成java类
            cl = Thread.currentThread().getContextClassLoader();
        }
        catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            // 没有线程上下文类加载器时，使用此类的类加载器。实验结果：两个bean的通过这种方式获取的CLassLoader对象是一样的
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}
