package org.painye.redisdemo.service.impl;

import org.redisson.api.RedissonClient;
import org.springframework.cache.support.AbstractValueAdaptingCache;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.Callable;

/**
 * @author painye
 * @Description
 * @create 2025-06-10 13:28
 */
@Service
public class RedisCacheDemoServiceImpl extends AbstractValueAdaptingCache{

    @Resource
    private RedissonClient redissonClient;

    protected RedisCacheDemoServiceImpl() {
        super(false);
    }

    @Override
    public String getName() {
        return "redis-cache";
    }

    @Override
    public Object getNativeCache() {
        return null;
    }

    @Override
    public <T> T get(Object key, Callable<T> valueLoader) {
        Object value = redissonClient.getBucket((String) key).get();
        if (value != null ) {
            return (T) value;
        }
        try {
           value =  valueLoader.call();
           redissonClient.getBucket((String) key).set(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return (T) value;
    }

    @Override
    public void put(Object key, Object value) {
        redissonClient.getBucket((String) key).set(value);
    }

    @Override
    public void evict(Object key) {
        redissonClient.getBucket((String) key).delete();
    }

    @Override
    public void clear() {
        redissonClient.getKeys().flushdb();
    }

    @Override
    protected Object lookup(Object key) {
        Object value = redissonClient.getBucket((String) key).get();
        return value;
    }
}
