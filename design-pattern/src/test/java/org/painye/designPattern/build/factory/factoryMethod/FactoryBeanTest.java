package org.painye.designPattern.build.factory.factoryMethod;

import org.junit.Test;
import org.painye.designPattern.build.factory.Weapon;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:05
 */
public class FactoryBeanTest{


    @Test
    public void testFactoryMethod() throws Exception {
        Weapon weapon = null;
        TankFactoryBean tankFactoryBean = new TankFactoryBean();
        weapon = tankFactoryBean.getObject();
        weapon.attack();
        UziFactoryBean uziFactoryBean = new UziFactoryBean();
        weapon = uziFactoryBean.getObject();
        weapon.attack();
        ItalianGunFactoryBean italianGunFactoryBean = new ItalianGunFactoryBean();
        weapon = italianGunFactoryBean.getObject();
        weapon.attack();
    }

}