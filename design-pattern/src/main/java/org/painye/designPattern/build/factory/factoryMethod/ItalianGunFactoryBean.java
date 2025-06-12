package org.painye.designPattern.build.factory.factoryMethod;

import org.painye.designPattern.build.factory.product.impl.ItalianGun;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:03
 */
public class ItalianGunFactoryBean implements FactoryBean<ItalianGun>{

    @Override
    public ItalianGun getObject() throws Exception {
        return new ItalianGun();
    }

    @Override
    public Class<ItalianGun> getObjectType() {
        return ItalianGun.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
