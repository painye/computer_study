package org.painye.designPattern.build.factory.abstractFactory;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 13:51
 */
public class DefaultListableBeanFactory implements BeanFactory {
    @Override
    public Object getBean(String name) throws Exception {
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws Exception {
        return null;
    }

}
