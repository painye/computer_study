package org.painye.designPattern.behavior.stratgies;

/**
 * @author painye
 * @Description
 * @create 2025-06-11 21:15
 */
public class CallerRunsPolicy implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution() {
//        if (!e.isShutdown()) {
//            r.run();
//        }
        System.out.println("执行拒绝策略"+this.getClass()+":在当前线程池的执行线程里执行当前被拒绝的任务");

    }
}
