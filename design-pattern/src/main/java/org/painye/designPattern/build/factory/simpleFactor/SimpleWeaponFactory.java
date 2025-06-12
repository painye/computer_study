package org.painye.designPattern.build.factory.simpleFactor;

import org.painye.designPattern.build.factory.ItalianGun;
import org.painye.designPattern.build.factory.Tank;
import org.painye.designPattern.build.factory.Uzi;
import org.painye.designPattern.build.factory.Weapon;

/**
 * @author painye
 * @Description 简单工厂模式实现一个武器加工厂
 * @create 2025-06-12 10:08
 */
public class SimpleWeaponFactory {

    /**
     * 创建实例方法
     * @param type
     * @return
     */
    public static Weapon getWeapon(String type) {
        if ("ItalianGun".equalsIgnoreCase(type)) {
            return new ItalianGun();
        } else if ("Tank".equalsIgnoreCase(type)) {
            return new Tank();
        } else if ("Uzi".equalsIgnoreCase(type)) {
            return new Uzi();
        } else {
            throw new RuntimeException("对不起，您定制的武器类型["+type+"]不在我们的生产范围");
        }
    }

    public static void main(String[] args) {
        Weapon weapon = SimpleWeaponFactory.getWeapon("ItalianGun");
        weapon.attack();
        weapon = SimpleWeaponFactory.getWeapon("Tank");
        weapon.attack();
        weapon = SimpleWeaponFactory.getWeapon("Uzi");
        weapon.attack();
        weapon = SimpleWeaponFactory.getWeapon("歼12");
        weapon.attack();
    }
}
