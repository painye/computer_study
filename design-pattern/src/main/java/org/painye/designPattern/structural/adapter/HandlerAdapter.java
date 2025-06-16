package org.painye.designPattern.structural.adapter;

/**
 * @author painye
 * @Description 目标接口: spring中处理请求的核心方法接口
 * @create 2025-06-13 17:56
 */
public interface HandlerAdapter {

    /**
     * 处理本次的http请求
     * @param request   http请求
     * @param response  http响应
     * @param handler   处理器
     */
    void handler(String request, String response, Object handler);
}
