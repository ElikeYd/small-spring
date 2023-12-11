package cn.bugstack.springframework.beans;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 *
 * bean 属性信息
 */
public class PropertyValue {

    /**
     * 属性名
     */
    private final String name;

    /**
     * 属性值，可能是某个对象，例如userDao对象
     */
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
