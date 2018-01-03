/**
 *
 */
package com.yiche.smp.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


/**
 * 说明:
 *
 * @author wangyubing
 * @version 1.0
 */
public class IOUtil {

    private IOUtil() {
    }

    /**
     * <b>function:关闭流</b>
     */
    public static void close(AutoCloseable... streams) {
        for (AutoCloseable stream : streams) {
            if (stream != null) {
                try {
                    stream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * <b>function:InputStream转String</b>
     */
    public static String readAsString(InputStream inputStream, boolean closeInputStream) {
        StringBuilder content = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                content.append(temp).append('\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(bufferedReader, inputStreamReader);
            if (closeInputStream) {
                close(inputStream);
            }
        }
        return content.toString();
    }


    /**
     * <b>function:copy io</b>
     *
     * @return void
     */
    public static void copy(InputStream inputStream, OutputStream outputStream, boolean closeInputStream, boolean closeOutputStream) throws IOException {
        byte buffer[] = new byte[8192];
        try {
            for (; ; ) {
                int res = inputStream.read(buffer);
                if (res == -1) {
                    break;
                }
                if (res > 0) {
                    if (outputStream != null) {
                        outputStream.write(buffer, 0, res);
                    }
                }
            }
        } finally {
            if (closeInputStream) {
                close(inputStream);
            }
            if (closeOutputStream) {
                close(outputStream);
            }
        }
    }
}
