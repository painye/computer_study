package org.painye.redisdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author painye
 * @Description
 * @create 2025-06-10 10:34
 */
@Controller
public class RedisDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello spring!!!";
    }
}
