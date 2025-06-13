package org.painye.designPattern.Structural.adapter;

/**
 * @author painye
 * @Description 适配器：将HandlerMethod与HandlerAdapter接口适配一下
 * @create 2025-06-13 18:09
 */
public class RequestMappingHandlerAdapter implements HandlerAdapter{
    @Override
    public void handler(String request, String response, Object handler) {
        HandlerMethod methodHandler = (HandlerMethod) handler;
        methodHandler.method(request, response);
    }
}
