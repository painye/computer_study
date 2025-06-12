package org.painye.designPattern.build.factory.abstractFactory;

import org.painye.designPattern.build.factory.product.Transportation;
import org.painye.designPattern.build.factory.product.Weapon;
import org.painye.designPattern.build.factory.product.impl.Boat;
import org.painye.designPattern.build.factory.product.impl.ItalianGun;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:28
 */
public class SeaWarFactory implements WarFactory{
    @Override
    public Weapon createWeapon() {
        return new ItalianGun();
    }

    @Override
    public Transportation createTransportation() {
        return new Boat();
    }
}
