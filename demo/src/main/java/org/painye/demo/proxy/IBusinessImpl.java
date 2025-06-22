package org.painye.demo.proxy;

/**
 * @author painye
 * @Description 业务实现类
 * @create 2025-06-22 10:07
 */
public class IBusinessImpl implements Business{
    @Override
    public void doBusiness() {
        System.out.println("实现类完成具体的业务");
    }
}
