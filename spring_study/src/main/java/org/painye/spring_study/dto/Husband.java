package org.painye.spring_study.dto;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author painye
 * @Description
 * @create 2025-06-18 13:37
 */

@Data
@Component
public class Husband {

    private String name;

    private int age;

    @Resource
    Wife wife;
}
