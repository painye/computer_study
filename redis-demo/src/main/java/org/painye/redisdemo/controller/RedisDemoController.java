package org.painye.redisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author painye
 * @Description
 * @create 2025-06-10 10:34
 */
@RestController
public class RedisDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello spring!!!";
    }
}
