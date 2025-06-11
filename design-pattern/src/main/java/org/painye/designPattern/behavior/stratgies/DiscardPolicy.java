package org.painye.designPattern.behavior.stratgies;

/**
 * @author painye
 * @Description
 * @create 2025-06-11 21:25
 */
public class DiscardPolicy implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution() {
        System.out.println("执行拒绝策略"+this.getClass()+":我什么都不做，相当于这个无法执行的方法被我丢弃了");

    }
}
