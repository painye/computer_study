package org.painye.designPattern.build.factory.abstractFactory;

import org.painye.designPattern.build.factory.product.Transportation;
import org.painye.designPattern.build.factory.product.Weapon;

/**
 * @author painye
 * @Description 抽象工厂
 * @create 2025-06-12 15:22
 */
public interface WarFactory {

    /**
     * 生产武器
     * @return
     */
    Weapon createWeapon();

    /**
     * 生产运输工具
     * @return
     */
    Transportation createTransportation();
}
