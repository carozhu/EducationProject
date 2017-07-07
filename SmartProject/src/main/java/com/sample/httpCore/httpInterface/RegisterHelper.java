package com.sample.httpCore.httpInterface;

import android.content.Context;

import com.sample.entity.VerifyCodeBean;
import com.smart.rx.RxBus;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by caro on 2017/7/3.
 */

public class RegisterHelper {

    private Context context;
    private RegisterHelper instance;

    public RegisterHelper getRegisterHelperInstance(Context context) {
        if (instance == null) {
            instance = new RegisterHelper(context);
        }
        return instance;
    }

    public RegisterHelper(Context context) {
        this.context = context;
    }

    /**
     * 获取验证码Http操作
     * Observer观察者
     *
     * @param phone
     */
    public void getVerifySMSCode(String phone) {
        HttpApi httpAPI = RetrofitUtils.createApi(context, HttpApi.class);
        httpAPI.getVerifyCode(phone)
                .subscribeOn(Schedulers.io())//指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread())// 指定 Subscriber 的回调发生在主线程
                .subscribe(new Observer<VerifyCodeBean>() {
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();

                        RxBus.getDefault().post(e);

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(VerifyCodeBean verifyCodeBean) {
                        RxBus.getDefault().post(verifyCodeBean);

                    }
                });

    }
}
