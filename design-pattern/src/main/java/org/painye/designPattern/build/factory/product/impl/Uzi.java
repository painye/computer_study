package org.painye.designPattern.build.factory.product.impl;

import org.painye.designPattern.build.factory.product.Weapon;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 10:25
 */
public class Uzi implements Weapon {
    @Override
    public void attack() {
        System.out.println("我是uzi冲锋枪，哒哒哒");
    }
}
