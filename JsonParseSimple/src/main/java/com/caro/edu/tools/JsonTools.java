package com.caro.edu.tools;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by caro on 2016/12/8.
 */

public class JsonTools {
    /**
     * 将网络流转成json格式的字符串
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static String ConvertStream2Json(InputStream inputStream) throws IOException {
        String jsonStr = "";
        // ByteArrayOutputStream相当于内存输出流
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        // 将输入流转移到内存输出流中
        while ((len = inputStream.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, len);
        }
        // 将内存流转换为字符串
        jsonStr = new String(out.toByteArray());
        return jsonStr;
    }
}
