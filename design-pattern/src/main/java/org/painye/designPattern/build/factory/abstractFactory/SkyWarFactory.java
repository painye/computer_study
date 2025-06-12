package org.painye.designPattern.build.factory.abstractFactory;

import org.painye.designPattern.build.factory.product.Transportation;
import org.painye.designPattern.build.factory.product.Weapon;
import org.painye.designPattern.build.factory.product.impl.Plain;
import org.painye.designPattern.build.factory.product.impl.Uzi;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:29
 */
public class SkyWarFactory implements WarFactory{
    @Override
    public Weapon createWeapon() {
        return new Uzi();
    }

    @Override
    public Transportation createTransportation() {
        return new Plain();
    }
}
