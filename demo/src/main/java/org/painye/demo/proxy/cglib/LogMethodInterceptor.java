package org.painye.demo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author painye
 * @Description 日志代理
 * @create 2025-06-22 10:38
 */
public class LogMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("===>开始执行");
        // 注意这里一点过要用MethodProxy.invokeSuper进行方法调用，不能用原方法，否则会有问题
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("===>执行结束");
        return result;
    }



    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Service proxyService = (Service) enhancer.create();
        proxyService.doService();
    }
}
