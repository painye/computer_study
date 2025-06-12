package org.painye.designPattern.build.factory.product.impl;

import org.painye.designPattern.build.factory.product.Transportation;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:18
 */
public class Train implements Transportation {
    @Override
    public void transport() {
        System.out.println("我是火车，我走铁轨");
    }
}
