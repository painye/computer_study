package org.painye.designPattern.Structural.adapter;

/**
 * @author painye
 * @Description 适配者类
 * @create 2025-06-13 18:00
 */
public class HandlerMethod {

    public void method(String request, String response){
        System.out.println("我是被@RequestMaing注解标记的，[/spring/user/login]url对应的方法，我现在被执行了!!!");
    }
}
