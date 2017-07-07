package com.sample;

import android.app.Application;

import com.sample.httpCore.httpInterface.ConfigureManager;
import com.sample.httpCore.httpInterface.RetrofitUtils;

import retrofit2.Retrofit;

/**
 * Created by caro on 2017/7/3.
 */

public class SampleProectApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        RetrofitUtils.initRetrofit(Consts.HttpBaseUrl);
        ConfigureManager.getConfigureManager().setOkhttpCache(false);
    }
}
