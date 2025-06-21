package org.painye.spring_study.dto;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author painye
 * @Description 有一个原型成员变量的单例Bean
 * @create 2025-06-21 17:09
 */
@Component
public class SingletonBean {

    /**
     * 注意这里注入的是ObjectFactory，而不是PrototypeBean。直接注入PrototypeBean
     */
    @Autowired
    private ObjectFactory<PrototypeBean> prototypeBeanObjectFactory;

    public PrototypeBean getPrototypeBean(){
        // 这里Spring的DefaultListableBeanFactory实现了getObject方法，每次都会从Spring容器中获取Bean。
        return prototypeBeanObjectFactory.getObject();
    }


}
