package org.painye.designPattern.structural.wrapper;

import java.io.IOException;

/**
 * @author painye
 * @Description 具体适配器：功能增强，在原有的InputStream上增加缓冲的功能
 * @create 2025-06-16 18:16
 */
public class BufferedInputStream extends FilterInputStream {

    public BufferedInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int x = super.read();
        System.out.printf("按照[%s]的方式读取数据\n", FileInputStream.class.getName());
        return x;
    }
}
