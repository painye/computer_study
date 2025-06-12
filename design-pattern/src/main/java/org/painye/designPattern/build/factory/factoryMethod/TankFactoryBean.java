package org.painye.designPattern.build.factory.factoryMethod;

import org.painye.designPattern.build.factory.product.impl.Tank;
import org.painye.designPattern.build.factory.product.Weapon;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 14:57
 */
public class TankFactoryBean implements FactoryBean<Weapon>{

    private Tank tank;

    @Override
    public Weapon getObject() throws Exception {
        if (this.tank == null) {
            this.tank = new Tank();
        }
        return this.tank;
    }

    @Override
    public Class<Weapon> getObjectType() {
        return Weapon.class;
    }
}
