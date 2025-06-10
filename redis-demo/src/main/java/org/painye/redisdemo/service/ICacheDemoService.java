package org.painye.redisdemo.service;

/**
 * @author painye
 * @Description
 * @create 2025-06-10 13:23
 */

public interface ICacheDemoService {

    /**
     * 添加一个String的Enrty
     * @param key   键
     * @param value 值
     * @return
     */
    public boolean addStringEntry(String key, String value);

    /**
     * 删除键
     * @param key  待删除的建
     * @return
     */
    public boolean removeKey(String key);

    /**
     * 获取键所对应的值
     * @param key
     * @return
     */
    public Object getEntry(String key);


}
