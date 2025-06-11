package org.painye.designPattern.behavior.stratgies;

/**
 * @author painye
 * @Description 无法被ThreadPoolExecutor线程池执行的任务的handler
 * @create 2025-06-11 20:50
 */
public interface RejectedExecutionHandler {

    /**
     *当线程池无法接收任务时就可能会被执行这个方法。一般发生在线程或这队列不够用，或者线程池被关闭的时候
     */
    void rejectedExecution();

}
