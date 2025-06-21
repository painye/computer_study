package org.painye.spring_study;

import org.junit.jupiter.api.Test;
import org.painye.spring_study.dto.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringStudyApplicationTests {

    @Autowired
    private SingletonBean singletonBean;

    @Test
    public void TestObjectFactory() {
        System.out.println(singletonBean.getPrototypeBean());
        System.out.println(singletonBean.getPrototypeBean());
        System.out.println(singletonBean.getPrototypeBean());
    }

    @Test
    void contextLoads() {

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名内部类创建线程");
            }
        }).start();

        //lambda表达式
        new Thread(()->{
            System.out.println("我是lambda表达式创建的线程");
        }).start();

        List<String> names = Arrays.asList("孙悟空", "猪八戒", "沙和尚", "白龙马");
        names.forEach(name -> System.out.println(name));
    }

    @Test
    public void springTest() {

    }

}
