package org.painye.redisdemo.config;

import lombok.Data;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author painye
 * @Description
 * @create 2025-06-10 13:29
 */
@Configuration
@Data
@ConfigurationProperties(prefix = "spring.configuration.redis")
public class RedissonConfig {

    /**
     * redis的IP地址
     */
    private String host;

    /**
     * redis的端口号
     */
    private String port;

    /**
     * redis的密码
     */
    private String password;

    /**
     * redis使用的数据库
     */
    private String database;

    @Bean
    public RedissonClient redissonClient(){
        Config config  = new Config();
        config.useSingleServer()
                .setAddress("redis://" + host + ":" + port)
                .setDatabase(Integer.parseInt(database))
                .setPassword(password)
                .setConnectionPoolSize(64);
        return Redisson.create(config);

    }

}
