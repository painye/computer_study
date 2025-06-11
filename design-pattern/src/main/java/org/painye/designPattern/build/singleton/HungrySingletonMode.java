package org.painye.designPattern.build.singleton;

/**
 * @author painye
 * @Description 饿汉式单例模式
 * @create 2025-06-11 10:50
 */
public class HungrySingletonMode {

    /**
     * 类创建过程中就创建单例，保证了线程安全
     */
    private static final HungrySingletonMode instance = new HungrySingletonMode();

    /**
     * 私有化构造器
     */
    private HungrySingletonMode() {
        init();
    }

    /**
     * 公共访问点中直接返回实例
     * @return 返回单例
     */
    public static HungrySingletonMode getInstance() {
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
