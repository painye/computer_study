package org.painye.designPattern.build.singleton;

/**
 * @author painye
 * @Description 双重检查锁机制单例模式
 * @create 2025-06-11 13:32
 */
public class DCLSingletonMode {

    /**
     * 这里需要使用禁止指令重排序的关键字volatile，保证创建实例过程是原子操作
     */
    private static volatile DCLSingletonMode instance;

    /**
     * 防止重复初始化的标记
     */
    private static Boolean initialized = false;

    private DCLSingletonMode() {
        if (initialized) {
            throw new RuntimeException(DCLSingletonMode.class+"类只允许实例化一次");
        }
        init();
        initialized = true;
    }

    /**
     *双重锁检查机制缩小锁的粒度，既保证线程安全单例，又保证性能
     * @return 单例
     */
    public static DCLSingletonMode getInstance() {
        if (instance == null) {     //第一次检查用来减少竞争锁，实例创建好后没必要上锁，直接获取实例就可以
            synchronized (DCLSingletonMode.class) {
                if (instance == null) {  //第二次检查用来保证创建实例的线程安全，确保实例唯一
                    instance = new DCLSingletonMode();
                }
            }
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

    /**
     * 重置单例实例
     */
    public static void reinit() {
        if (initialized) { //如果本来就是未初始化状态就不用重置了
            synchronized (DCLSingletonMode.class) {
                initialized = false; // 1、将初始化标志重置
                instance = null;    // 2、实例置空
            }
        }
    }
}
