package org.painye.demo.proxy;

import lombok.Data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author painye
 * @Description
 * @create 2025-06-22 11:37
 */
@Data
public class Student {

    private String name;

    private int age;

    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String study(String knowledge) {
        System.out.printf("我在学习[%s]%n", knowledge);
        return knowledge;
    }

    public static void main(String[] args) throws Exception{
        // 1、获取class对象
        Class<?> aClass = Class.forName("org.painye.demo.proxy.Student");
        // 2、创建对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, int.class);
        Object o = declaredConstructor.newInstance("小米", 12, 6);
        System.out.println(o);
        // 3、访问字段
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age.get(o));
        age.set(o, 13);
        System.out.println(o);
        // 4、调用方法
        Method study = aClass.getDeclaredMethod("study", String.class);
        Object result = study.invoke(o, "反射");
    }
}
