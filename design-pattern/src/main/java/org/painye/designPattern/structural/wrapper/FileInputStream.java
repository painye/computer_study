package org.painye.designPattern.structural.wrapper;

import java.io.IOException;

/**
 * @author painye
 * @Description 具体组件：读取文件的输入流
 * @create 2025-06-16 17:35
 */
public class FileInputStream extends InputStream {

    private final String path;

    public FileInputStream(String path) {
        this.path = path;
    }

    @Override
    public int read() throws IOException {
        System.out.printf("从[%s]文件中按照[%s]的方式读取数据\n", path, FileInputStream.class.getName());
        return 0;
    }
}
