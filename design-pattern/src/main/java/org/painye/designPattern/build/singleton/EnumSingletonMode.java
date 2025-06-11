package org.painye.designPattern.build.singleton;

/**
 * @author painye
 * @Description 枚举实现单例
 * @create 2025-06-11 14:53
 */
public enum EnumSingletonMode {

    Instance;   //唯一的实例

    private String config = null;

    EnumSingletonMode() {
        init();
    }

    private void init() {
        config = "我是刚初始化后的配置文件";
        try {
            // 模拟重量级配置初始化耗时1s
            Thread.sleep(1000);
            System.out.println("初始化........");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void updateConfig(String str) {
        config = str;
    }

    public String getConfig() {
        return config;
    }
}
