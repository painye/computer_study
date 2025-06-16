package org.painye.designPattern.structural.wrapper;


import org.junit.Test;

import java.io.DataInput;
import java.io.IOException;

/**
 * @author painye
 * @Description
 * @create 2025-06-16 18:27
 */
public class BufferedInputStreamTest {

    @Test
    public void testWrapper() throws IOException {
        InputStream in = new FileInputStream("西游记.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(bufferedInputStream);
        dis.readLine();
    }

}