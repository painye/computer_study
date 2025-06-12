package org.painye.designPattern.build.factory.product.impl;

import org.painye.designPattern.build.factory.product.Weapon;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 10:24
 */
public class Tank implements Weapon {
    @Override
    public void attack() {
        System.out.println("我是坦克，坦克开炮");
    }
}
