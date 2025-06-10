package org.painye.redisdemo.controller;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractValueAdaptingCache;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author painye
 * @Description
 * @create 2025-06-10 10:34
 */
@RequestMapping("/cache")
@RestController
public class RedisDemoController {

    @Resource
    private AbstractValueAdaptingCache cacheDemoService;

    @GetMapping("/hello")
    public String hello() {
        return "hello spring!!!";
    }

    @PostMapping("/put")
    public void putEntry(@RequestParam("key") String key, @RequestParam("value") String value) {
        cacheDemoService.put(key, value);
    }

    @GetMapping("/get")
    @ResponseBody
    public Object getEntry(@RequestParam("key") String key) {
        Cache.ValueWrapper valueWrapper = cacheDemoService.get(key);
        if (valueWrapper == null) {
            return String.format("没有找到[%s]对应的value", key);
        }
        return valueWrapper.get();
    }

    @DeleteMapping("/remove")
    public void removeEntry(@RequestParam("key") String key) {
        cacheDemoService.evict(key);
    }

}
