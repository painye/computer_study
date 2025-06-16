package org.painye.designPattern.structural.adapter;

/**
 * @author painye
 * @Description
 * @create 2025-06-13 18:12
 */
public class DispatcherServlet {

    private void doDispatch(String request, String response) {
        HandlerAdapter ha = new RequestMappingHandlerAdapter();
        HandlerMethod hm = new HandlerMethod();
        ha.handler(request, response, hm);
    }

    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.doDispatch(null, null);
    }
}
