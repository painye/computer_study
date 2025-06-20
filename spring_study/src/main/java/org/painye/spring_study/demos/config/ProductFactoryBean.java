package org.painye.spring_study.demos.config;

import org.painye.spring_study.dto.Product;
import org.painye.spring_study.dto.Wife;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author painye
 * @Description wife的factoryBean
 * @create 2025-06-20 18:43
 */
@Component("productFactoryBean")
public class ProductFactoryBean implements FactoryBean<Product> {
    @Override
    public Product getObject() throws Exception {
        Product product = new Product();
        System.out.println("=======使用ProductFactoryBean进行复杂的逻辑来创建:");
        return product;
    }

    @Override
    public Class<?> getObjectType() {
        return Product.class;
    }
}
