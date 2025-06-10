package org.painye.redisdemo.service.impl;

import org.painye.redisdemo.service.ICacheDemoService;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author painye
 * @Description
 * @create 2025-06-10 13:28
 */
@Service
public class RedisCacheDemoServiceImpl implements ICacheDemoService {

    @Resource
    private RedissonClient redissonClient;

    @Override
    public boolean addStringEntry(String key, String value) {
        redissonClient.getBucket(key).set(value);
        return true;
    }

    @Override
    public boolean removeKey(String key) {
        redissonClient.getBucket(key).delete();
        return false;
    }

    @Override
    public Object getEntry(String key) {
        return redissonClient.getBucket(key).get();
    }
}
