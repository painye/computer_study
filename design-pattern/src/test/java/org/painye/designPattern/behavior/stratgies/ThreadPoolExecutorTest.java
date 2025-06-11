package org.painye.designPattern.behavior.stratgies;


import org.junit.Test;

/**
 * @author painye
 * @Description
 * @create 2025-06-11 21:43
 */
public class ThreadPoolExecutorTest {

    @Test
    public void testThreadPoolExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        // 丢弃最早未被执行的任务然后执行当前任务
        RejectedExecutionHandler rejectedExecutionHandler = new DiscardOldestPolicy();
        threadPoolExecutor.setHandler(rejectedExecutionHandler);
        threadPoolExecutor.executor();
        rejectedExecutionHandler = new AbortPolicy();
        threadPoolExecutor.setHandler(rejectedExecutionHandler);
        threadPoolExecutor.executor();
        rejectedExecutionHandler = new CallerRunsPolicy();
        threadPoolExecutor.setHandler(rejectedExecutionHandler);
        threadPoolExecutor.executor();
        rejectedExecutionHandler = new DiscardPolicy();
        threadPoolExecutor.setHandler(rejectedExecutionHandler);
        threadPoolExecutor.executor();
    }

}