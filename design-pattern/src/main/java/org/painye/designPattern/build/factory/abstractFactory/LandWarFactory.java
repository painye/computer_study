package org.painye.designPattern.build.factory.abstractFactory;

import org.painye.designPattern.build.factory.product.Transportation;
import org.painye.designPattern.build.factory.product.Weapon;
import org.painye.designPattern.build.factory.product.impl.Tank;
import org.painye.designPattern.build.factory.product.impl.Train;

/**
 * @author painye
 * @Description 陆战
 * @create 2025-06-12 15:25
 */
public class LandWarFactory implements WarFactory {
    @Override
    public Weapon createWeapon() {
        return new Tank();
    }

    @Override
    public Transportation createTransportation() {
        return new Train();
    }
}
