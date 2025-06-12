package org.painye.designPattern.build.factory;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 10:26
 */
public class ItalianGun implements Weapon {
    @Override
    public void attack() {
        System.out.println("我他娘的意大利炮呢，开炮！开炮！");
    }
}
