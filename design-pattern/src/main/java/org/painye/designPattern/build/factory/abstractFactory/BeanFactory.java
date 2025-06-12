package org.painye.designPattern.build.factory.abstractFactory;

/**
 * @author painye
 * @Description spring中的最顶级抽象工厂接口
 * @create 2025-06-12 13:19
 */
public interface BeanFactory {

    /**
     * 返回指定bean的实例
     *
     * @param name 要获取的bean的别名
     * @return Bean实例
     * @throws Exception
     */
    Object getBean(String name) throws Exception;


    /**
     * 返回指定bean的实例
     * @param name 要获取的bean的别名
     * @param requiredType bean的类型
     * @return
     * @param <T>
     * @throws Exception
     */
    <T> T getBean(String name, Class<T> requiredType) throws Exception;

}
