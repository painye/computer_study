package org.painye.designPattern.build.factory.factoryMethod;

import org.junit.Test;
import org.painye.designPattern.build.factory.abstractFactory.LandWarFactory;
import org.painye.designPattern.build.factory.abstractFactory.SeaWarFactory;
import org.painye.designPattern.build.factory.abstractFactory.SkyWarFactory;
import org.painye.designPattern.build.factory.abstractFactory.WarFactory;
import org.painye.designPattern.build.factory.product.Transportation;
import org.painye.designPattern.build.factory.product.Weapon;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:05
 */
public class FactoryTest {


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

    @Test
    public void testAbstractFactory(){
        Transportation transportation = null;
        Weapon weapon = null;
        WarFactory warFactory = null;
        warFactory = new LandWarFactory();
        transportation = warFactory.createTransportation();
        weapon = warFactory.createWeapon();
        transportation.transport();
        weapon.attack();
        System.out.println();

        warFactory = new SeaWarFactory();
        transportation = warFactory.createTransportation();
        weapon = warFactory.createWeapon();
        transportation.transport();
        weapon.attack();
        System.out.println();


        warFactory = new SkyWarFactory();
        transportation = warFactory.createTransportation();
        weapon = warFactory.createWeapon();
        transportation.transport();
        weapon.attack();
        System.out.println();


    }

}