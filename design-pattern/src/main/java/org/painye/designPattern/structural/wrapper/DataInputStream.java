package org.painye.designPattern.structural.wrapper;

import java.io.IOException;

/**
 * @author painye
 * @Description
 * @create 2025-06-16 18:31
 */
public class DataInputStream extends FilterInputStream{

    public DataInputStream(InputStream in) {
        super(in);
    }

    public void readLine() throws IOException {
        int x = read();
        System.out.printf("按照[%s]的方式一行一行的读取数据\n", DataInputStream.class.getName());
    }
}
