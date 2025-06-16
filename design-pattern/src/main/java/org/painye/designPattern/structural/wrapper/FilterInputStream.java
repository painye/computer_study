package org.painye.designPattern.structural.wrapper;

import java.io.IOException;

/**
 * @author painye
 * @Description 抽象适配器：对InputStream类进行功能增强
 * @create 2025-06-16 18:12
 */
public class FilterInputStream extends InputStream {

    /**
     * 组合关系持有原具体组件
     */
    protected volatile InputStream in;

    public FilterInputStream(InputStream in) {
        this.in = in;
    }

    @Override
    public int read() throws IOException {
        return in.read();
    }
}
