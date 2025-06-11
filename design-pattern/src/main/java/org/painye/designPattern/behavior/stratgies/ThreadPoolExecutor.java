package org.painye.designPattern.behavior.stratgies;

/**
 * @author painye
 * @Description 自定义线程池
 * @create 2025-06-11 21:33
 */
public class ThreadPoolExecutor {

    /**
     * 拒绝策略
     */
    private volatile RejectedExecutionHandler handler;

    public ThreadPoolExecutor(){
    }

    public ThreadPoolExecutor(RejectedExecutionHandler handler) {
        this.handler = handler;
    }

    public void setHandler(RejectedExecutionHandler handler) {
        this.handler = handler;
    }

    /**
     * 在将来的某个时间执行给定的任务。该任务可以在新线程或现有池线程中执行。
     * 如果该任务因为没有线程可以分配且任务队列已满，则该任务由当前 RejectedExecutionHandler来处理.
     */
    public void executor() {
        System.out.print("执行线程池方法，但是没有线程分配，任务队列也满了============》");
        reject();
    }

    /**
     * 对无法执行的任务按照拒绝策略来执行
     */
    final void reject() {
        this.handler.rejectedExecution();
    }
}
