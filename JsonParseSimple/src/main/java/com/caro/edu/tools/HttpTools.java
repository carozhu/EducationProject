package com.caro.edu.tools;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by caro on 2016/12/8.
 */

public class HttpTools {

    /**
     * HttpURLConnection get 请求。
     * @param urlStr 请求地址
     * @return 返回url地址请求得到的json格式的String
     */
    public static String getJsonContent(String urlStr) {
        try {
            // 获取HttpURLConnection连接对象
            URL url = new URL(urlStr);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            // 设置连接属性
            httpConn.setConnectTimeout(3000);
            httpConn.setDoInput(true);
            httpConn.setRequestMethod("GET");
            // 获取相应码
            int respCode = httpConn.getResponseCode();
            if (respCode == 200) {
                return JsonTools.ConvertStream2Json(httpConn.getInputStream());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
