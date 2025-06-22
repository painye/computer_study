package org.painye.demo.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author painye
 * @Description 日志代理
 * @create 2025-06-22 10:08
 */
public class LogInvocationHandler implements InvocationHandler {

    /**
     * 目标类
     */
    private Business target;

    public LogInvocationHandler(Business target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====》开始执行："+ method);
        Object result = method.invoke(target,args);
        System.out.println("====》执行结束："+ method);
        return result;
    }

    public static void main(String[] args) {
        IBusinessImpl target = new IBusinessImpl();
        Business proxy = (Business) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LogInvocationHandler(target));
        proxy.doBusiness();
    }
}
