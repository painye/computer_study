package org.painye.spring_study.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author painye
 * @Description
 * @create 2025-06-18 13:39
 */
@Data
@Component
public class Wife {

    private int age;

    private String name;

    @Resource
    Husband husband;
}
