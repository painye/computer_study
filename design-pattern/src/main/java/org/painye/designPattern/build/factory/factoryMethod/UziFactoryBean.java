package org.painye.designPattern.build.factory.factoryMethod;

import org.painye.designPattern.build.factory.product.impl.Uzi;

/**
 * @author painye
 * @Description
 * @create 2025-06-12 15:00
 */
public class UziFactoryBean implements FactoryBean<Uzi> {

    private Uzi uzi;

    @Override
    public Uzi getObject() throws Exception {
        if (this.uzi == null) {
            this.uzi = new Uzi();
        }
        return this.uzi;
    }

    @Override
    public Class<Uzi> getObjectType() {
        return Uzi.class;
    }
}
