package org.painye.designPattern.build.factory.factoryMethod;

/**
 * @author painye
 * @Description 该接口用来定义需要执行工厂功能创建bean的特殊Bean
 * @create 2025-06-12 14:15
 */
public interface FactoryBean<T> {

    /**
     * 生产Bean
     * @return 实例
     * @throws Exception
     */
    T getObject() throws Exception;

    /**
     * 生产的bean的类型
     * @return 实例的类型
     */
    Class<?> getObjectType();

    /**
     * 默认单例
     * @return
     */
    default boolean isSingleton() {
        return true;
    }
}
