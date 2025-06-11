package org.painye.designPattern.behavior.template;

import org.junit.Test;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 0:32
 */
public class AbstractConfigTest {
    @Test
    public void test() {
        AbstractConfig redisConfig = new RedisConfig();
        redisConfig.updateConfig();
        AbstractConfig mysqlConfig = new DataBaseConfig();
        mysqlConfig.updateConfig();
    }

}