package cn.bugstack.springframework.context;

import java.util.EventObject;

/**
 * 所有应用程序事件都应该扩展的类。它是抽象的，因为对于通用事件来说，直接发布没有意义。
 *
 * Class to be extended by all application events. Abstract as it
 * doesn't make sense for generic events to be published directly.
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public abstract class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }

}
