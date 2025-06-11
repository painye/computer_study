package org.painye.designPattern.behavior.template;

/**
 * @author painye
 * @Description 抽象配置类
 * @create 2025-06-12 0:12
 */
public abstract class AbstractConfig {

    /**
     * 模板方法
     */
    public void updateConfig() {
        // 1、检查是否有修改权限   固定
        checkPermissions();
        // 2、检查配置是否有效性      可变
        checkParams();
        // 3、更新配置   可变
        update();
        // 4、写入配置   固定
        save();
    }

    /**
     * 固定流程
     */
    protected void checkPermissions() {
        System.out.print("===》检查权限通过");
    }

    /**
     * 钩子函数
     */
    protected abstract void checkParams();

    /**
     * 钩子函数
     */
    protected abstract void update();

    /**
     * 固定流程
     */
    protected void save(){
        System.out.println("===》配置更新写入文件成功");
    }


}
