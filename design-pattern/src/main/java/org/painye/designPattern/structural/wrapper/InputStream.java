package org.painye.designPattern.structural.wrapper;

import java.io.IOException;

/**
 * @author painye
 * @Description 抽象组件：InputStream所有字节流的基类
 * @create 2025-06-16 17:32
 */
public abstract class InputStream {

    /**
     *抽象的读方法
     */
    public abstract int read() throws IOException;
}
