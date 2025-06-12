package org.painye.designPattern.build.factory.product.impl;

import org.painye.designPattern.build.factory.product.Transportation;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:19
 */
public class Plain implements Transportation {
    @Override
    public void transport() {
        System.out.println("我是飞机，我走天上");
    }
}
