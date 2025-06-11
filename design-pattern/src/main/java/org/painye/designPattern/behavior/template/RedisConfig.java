package org.painye.designPattern.behavior.template;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 0:28
 */
public class RedisConfig extends AbstractConfig{
    @Override
    protected void checkParams() {
        System.out.print("===》redis参数校验通过");
    }

    @Override
    protected void update() {
        System.out.print("===》redis配置更新成功");
    }
}
