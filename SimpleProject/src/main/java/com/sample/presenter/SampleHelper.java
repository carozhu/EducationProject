package com.sample.presenter;

import android.app.Activity;
import android.content.Context;

import com.sample.R;


/**
 * Created by jrvansuita on 17/02/17.
 */

public class SampleHelper {

    private Context context;
    private static int theme = R.style.AppThemeDark;

    private SampleHelper(Context context) {
        this.context = context;
    }

    public static SampleHelper with(Activity activity){
        return new SampleHelper(activity);
    }

    public SampleHelper init(){
        //activity.setTheme(theme);
        return this;
    }



}
