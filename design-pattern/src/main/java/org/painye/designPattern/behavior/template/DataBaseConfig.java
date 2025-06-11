package org.painye.designPattern.behavior.template;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 0:31
 */
public class DataBaseConfig extends AbstractConfig{
    @Override
    protected void checkParams() {
        System.out.print("===》数据库参数校验通过");
    }

    @Override
    protected void update() {
        System.out.print("===》数据接口配置更新成功");
    }
}
