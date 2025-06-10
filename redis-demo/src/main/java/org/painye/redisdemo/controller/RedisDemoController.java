package org.painye.redisdemo.controller;

import org.painye.redisdemo.service.ICacheDemoService;
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
    private ICacheDemoService cacheDemoService;

    @GetMapping("/hello")
    public String hello() {
        return "hello spring!!!";
    }

    @PostMapping("/put")
    public boolean putEntry(@RequestParam("key") String key, @RequestParam("value") String value) {
        return cacheDemoService.addStringEntry(key, value);
    }

    @GetMapping("/get")
    public Object getEntry(@RequestParam("key") String key) {
        return cacheDemoService.getEntry(key);
    }

    @DeleteMapping("/remove")
    public boolean removeEntry(@RequestParam("key") String key) {
        return cacheDemoService.removeKey(key);
    }

}
