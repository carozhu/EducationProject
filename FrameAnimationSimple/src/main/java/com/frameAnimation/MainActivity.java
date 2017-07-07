package com.frameAnimation;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;

import kr.pe.burt.android.lib.faimageview.FAImageView;


public class MainActivity extends Activity {

    private Context context;
    private FAImageView faImageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main_debug);
        context = this;
        faImageView = (FAImageView) findViewById( R.id.imageView);


    }

    /*********/
    public void playangryAnimationdrinkmilk(View v) {
        if (faImageView.isAnimating()){
            faImageView.stopAnimation();
        }
        faImageView.clearAnimation();
        faImageView.reset();
        faImageView.setInterval(200);//设置间隔时间
        faImageView.setLoop(false);//设置是否循环播放动画
        faImageView.addImageFrame(R.mipmap.cat_drink0000);
        faImageView.addImageFrame(R.mipmap.cat_drink0002);
        faImageView.addImageFrame(R.mipmap.cat_drink0004);
        faImageView.addImageFrame(R.mipmap.cat_drink0006);
        faImageView.addImageFrame(R.mipmap.cat_drink0008);
        faImageView.addImageFrame(R.mipmap.cat_drink0010);
        faImageView.addImageFrame(R.mipmap.cat_drink0012);
        faImageView.addImageFrame(R.mipmap.cat_drink0014);
        faImageView.addImageFrame(R.mipmap.cat_drink0016);
        faImageView.addImageFrame(R.mipmap.cat_drink0018);
        faImageView.addImageFrame(R.mipmap.cat_drink0020);
        faImageView.addImageFrame(R.mipmap.cat_drink0022);
        faImageView.addImageFrame( R.mipmap.cat_drink0024);
        faImageView.addImageFrame( R.mipmap.cat_drink0026);
        faImageView.addImageFrame( R.mipmap.cat_drink0028);
        faImageView.addImageFrame( R.mipmap.cat_drink0030);
        faImageView.addImageFrame( R.mipmap.cat_drink0032);
        faImageView.addImageFrame( R.mipmap.cat_drink0034);
        faImageView.addImageFrame( R.mipmap.cat_drink0036);
        faImageView.addImageFrame( R.mipmap.cat_drink0038);
        faImageView.addImageFrame( R.mipmap.cat_drink0040);
        faImageView.addImageFrame( R.mipmap.cat_drink0042);
        faImageView.addImageFrame( R.mipmap.cat_drink0044);
        faImageView.addImageFrame( R.mipmap.cat_drink0046);
        faImageView.addImageFrame( R.mipmap.cat_drink0048);
        faImageView.addImageFrame( R.mipmap.cat_drink0050);
        faImageView.addImageFrame( R.mipmap.cat_drink0052);
        faImageView.addImageFrame( R.mipmap.cat_drink0054);
        faImageView.addImageFrame( R.mipmap.cat_drink0056);
        faImageView.addImageFrame( R.mipmap.cat_drink0058);
        faImageView.addImageFrame( R.mipmap.cat_drink0060);
        faImageView.addImageFrame( R.mipmap.cat_drink0062);
        faImageView.addImageFrame( R.mipmap.cat_drink0064);
        faImageView.addImageFrame( R.mipmap.cat_drink0066);
        faImageView.addImageFrame( R.mipmap.cat_drink0068);
        faImageView.addImageFrame( R.mipmap.cat_drink0070);
        faImageView.addImageFrame( R.mipmap.cat_drink0072);
        faImageView.addImageFrame( R.mipmap.cat_drink0074);
        faImageView.addImageFrame( R.mipmap.cat_drink0076);
        faImageView.addImageFrame( R.mipmap.cat_drink0078);
        faImageView.addImageFrame( R.mipmap.cat_drink0080);

        faImageView.startAnimation();
    }


    /*********/
    public void playangryAnimationFootLeft(View v) {
        if (faImageView.isAnimating()){
            faImageView.stopAnimation();
        }
        faImageView.clearAnimation();
        faImageView.reset();
        faImageView.setInterval(200);//设置间隔时间
        faImageView.setLoop(false);//设置是否循环播放动画
        faImageView.addImageFrame( R.mipmap.cat_foot_left0000);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0001);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0003);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0004);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0005);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0006);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0007);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0008);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0009);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0010);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0011);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0012);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0013);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0014);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0015);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0016);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0017);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0018);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0019);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0020);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0021);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0022);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0023);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0024);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0025);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0026);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0027);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0028);
        faImageView.addImageFrame( R.mipmap.cat_foot_left0029);
        //start animation
        faImageView.startAnimation();
    }


    public void playangryAnimationFootRight(View v) {
        if (faImageView.isAnimating()){
            faImageView.stopAnimation();
        }
        faImageView.clearAnimation();
        faImageView.reset();
        faImageView.setInterval(200);//设置间隔时间
        faImageView.setLoop(false);//设置是否循环播放动画
        faImageView.addImageFrame( R.mipmap.cat_foot_right0000);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0001);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0003);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0004);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0005);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0006);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0007);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0008);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0009);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0010);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0011);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0012);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0013);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0014);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0015);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0016);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0017);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0018);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0019);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0020);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0021);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0022);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0023);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0024);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0025);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0026);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0027);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0028);
        faImageView.addImageFrame( R.mipmap.cat_foot_right0029);
        //start animation
        faImageView.startAnimation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        faImageView.clearAnimation();
        faImageView.stopAnimation();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        faImageView.clearAnimation();
        faImageView.stopAnimation();
    }

}