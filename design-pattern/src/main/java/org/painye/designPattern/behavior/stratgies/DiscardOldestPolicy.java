package org.painye.designPattern.behavior.stratgies;

/**
 * @author painye
 * @Description 丢弃未被执行的任务队列里最早没有被执行的那一个，然后立即重试执行当前这个被拒绝的任务
 * @create 2025-06-11 21:02
 */
public class DiscardOldestPolicy implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution() {
//        if (!excut.isShutdown()) {
//            e.getQueue().poll();
//            e.execute(r);
//        }
        System.out.println("执行拒绝策略"+this.getClass()+":丢弃未被执行的任务里最早的那一个（即下一个），然后继续重试执行当前这个本应被拒绝任务");

    }
}
