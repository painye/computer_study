package org.painye.designPattern.build.singleton;

import org.omg.CosNaming.BindingIterator;

/**
 * @author painye
 * @Description 懒汉式单例模式
 * @create 2025-06-11 10:49
 */
public class LazySingletonMode {

    /**
     * 实例对象
     */
    private static LazySingletonMode instance;

    /**
     * 私有化构造器
     */
    private LazySingletonMode(){
        init();
    }

    /**
     * 公共访问点：通过在方法上加synchronized保证线程安全
     * @return 单例实例
     */
    public static synchronized LazySingletonMode getInstance() {
        if (instance == null) {// 只有第一次调用公共访问点时才创建实例
            instance = new LazySingletonMode();
        }
        return instance;
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
