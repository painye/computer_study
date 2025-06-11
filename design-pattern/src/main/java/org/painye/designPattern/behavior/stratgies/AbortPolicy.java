package org.painye.designPattern.behavior.stratgies;

/**
 * @author painye
 * @Description 抛弃当前这个任务，并报错
 * @create 2025-06-11 21:10
 */
public class AbortPolicy implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution() {
//        throw new RejectedExecutionException("Task " + r.toString() +
//                " rejected from " +
//                e.toString());
        System.out.println("执行拒绝策略"+this.getClass()+":丢弃当前这个无法执行的任务并报错");

    }
}
