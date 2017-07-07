package com.sample.httpCore.httpInterface;

import com.sample.entity.VerifyCodeBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by caro on 2017/7/3.
 */

public interface HttpApi {

    /**
     * baseHttpUrl = http://xxxx.com;
     * http://xxxx.com/smss
     * /smss
     * 获取验证码
     * Observable:被观察者
     * @param phone
     * @return
     */
    @FormUrlEncoded
    @POST("/smss")
    Observable<VerifyCodeBean> getVerifyCode(@Field("phone") String phone);
}
