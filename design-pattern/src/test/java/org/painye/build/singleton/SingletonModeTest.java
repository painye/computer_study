package org.painye.build.singleton;


import org.junit.Test;
import org.painye.designPattern.build.singleton.DCLSingletonMode;
import org.painye.designPattern.build.singleton.HungrySingletonMode;
import org.painye.designPattern.build.singleton.LazySingletonMode;
import org.painye.designPattern.build.singleton.StaticInnerClassSingletonMode;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author painye
 * @Description
 * @create 2025-06-11 11:04
 */
public class SingletonModeTest {

    ThreadPoolExecutor executor = new ThreadPoolExecutor(
            5, //corePoolSize：核心线程数
            8, //maximumPoolSize：最大线程数
            30, //空闲线程存活时间
            TimeUnit.SECONDS, //时间单位,秒
            new ArrayBlockingQueue<>(50), //任务队列
            Executors.defaultThreadFactory(), //默认的线程池工厂
            new ThreadPoolExecutor.CallerRunsPolicy() //拒绝策略
    );

    @Test
    public void testSingleton() {
        System.out.println("开始单例");
        for (int i=0; i<30; i++) {
            executor.execute(()->{
                System.out.println(Thread.currentThread().getName() +"调用单例对象："+ StaticInnerClassSingletonMode.getInstance());
            });
        }
        System.out.println("执行完毕");
        executor.shutdown(); // 停止接收新任务
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void testReflect() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz = DCLSingletonMode.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        boolean flag = declaredConstructor.newInstance() == DCLSingletonMode.getInstance() ;
        System.out.println("反射后创建的实例和单例是同一个嘛？"+flag);
    }

    @Test
    public void testReSerialize() throws IOException, ClassNotFoundException {
        DCLSingletonMode instance = DCLSingletonMode.getInstance();
        // 序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance);
        oos.close();
        byte[] bytes = baos.toByteArray();
        // 反序列化
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object o = ois.readObject();
        boolean flag = o==instance;
        System.out.println("实例化与反实例化的对象是同一个嘛？"+flag);
    }

}