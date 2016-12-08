package com.caro.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.caro.edu.JsonBean.DoubanbookBean;
import com.caro.edu.tools.GsonHelper;
import com.caro.edu.tools.HttpTools;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = MainActivity.class.getSimpleName();
    private Button gsonparseBtn, jsonObjectBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        gsonparseBtn = (Button) findViewById(R.id.JSONObjectParse);
        jsonObjectBtn = (Button) findViewById(R.id.GSONParse);
        jsonObjectBtn.setOnClickListener(this);
        gsonparseBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.JSONObjectParse:
                //开一个线程执行HttpURLConnection请求。HttpURLConnection本身不像StringRequest，StringRequest内部已经封装了异步请求操作
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        useHttpURLConnectionGetData(Const.DOUBANBOOKAPI);
                    }
                }).start();
                break;
            case R.id.GSONParse:
                useVolleyGetData(Const.DOUBANBOOKAPI);

                break;
        }
    }

    /**
     * 使用Volley中的StringRequest进行网络异步请求
     *
     * @param ApiUrl
     */
    private void useVolleyGetData(String ApiUrl) {
        StringRequest request = new StringRequest(ApiUrl, new Response.Listener<String>() {

            @Override
            public void onResponse(String arg0) {
                Log.i("info", arg0);
                //使用GSON工具简析json数据。从GSON解析json数据输出到DoubanbookBean类中。
                DoubanbookBean doubanbookBean = GsonHelper.parserJsonToBean(arg0, DoubanbookBean.class);
                //从G数据输出DoubanbookBean类中获取相应的数据。
                List<String> translatorList = doubanbookBean.getTranslator();
                for (int i = 0; i < translatorList.size(); i++) {
                    String translator = translatorList.get(i);
                    Log.i(TAG, "第" + i + "个翻译者名字 ： " + translator);
                }
            }

        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError arg0) {
                // TODO Auto-generated method stub
            }
        });
        // 将请求加入队列
        new Volley().newRequestQueue(getApplicationContext()).add(request);
    }

    /**
     * 使用android系统自带
     */

    private void useHttpURLConnectionGetData(String ApiUrl) {
        String getJson = HttpTools.getJsonContent(ApiUrl);
        //使用android自带原生JsonObject简析json数据。
        //将字符串转换成jsonObject对象
        try {
            JSONObject myJsonObject = new JSONObject(getJson);
            //简析JSONObjec中的key-value.
            String summary = myJsonObject.getString("summary");
            String price = myJsonObject.getString("price");
            Log.i(TAG, "summary ： " + summary);
            Log.i(TAG, "price ： " + price);

            //tags JsonArray
            JSONArray tagsJsonArray = myJsonObject.getJSONArray("tags");
            for (int i = 0; i < tagsJsonArray.length(); i++) {
                //获取JSONArray中的每一个JsonObject对象
                JSONObject tagsjObject = tagsJsonArray.getJSONObject(i);
                String count = tagsjObject.getString("count");
                Log.i(TAG, "第" + i + "个count ： " + count);
            }

            //translator jsonArray
            JSONArray translatorJsonArray = myJsonObject.getJSONArray("translator");
            for (int i = 0; i < translatorJsonArray.length(); i++) {
                //获取JSONArray中的每一个JsonObject对象
                String translator = translatorJsonArray.getString(i);
                Log.i(TAG, "第" + i + "个翻译者名字 ： " + translator);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
