package org.painye.designPattern.build.singleton;

/**
 * @author painye
 * @Description 静态内部类单例模式
 * @create 2025-06-11 14:22
 */
public class StaticInnerClassSingletonMode {

    /**
     * 私有化构造器
     */
    private StaticInnerClassSingletonMode(){
        init();
    }

    /**
     * 私有的静态内部类
     */
    private static class SingletonHolder {

        /**
         * 静态内部类的私有静态成员中创建实例实现单例（延迟加载）
         * 静态内部类不会随着外部类的加载而加载，静态内部类属于被动引用，只有在第一次访问静态内部类时，静态内部类才会被创建。
         *
         */
        private static final StaticInnerClassSingletonMode instance =
                new StaticInnerClassSingletonMode();

    }

    /**
     * 直接返回静态内部类中的静态成员实例
     * @return 单例
     */
    public static StaticInnerClassSingletonMode getInstance() {
        return SingletonHolder.instance;
    }

    private void init() {
        try {
            // 模拟重量级配置初始化耗时1s
            Thread.sleep(1000);
            System.out.println("初始化........");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
