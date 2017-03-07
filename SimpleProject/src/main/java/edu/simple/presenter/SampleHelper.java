package edu.simple.presenter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import edu.simple.R;
import edu.simple.builder.AboutBuilder;


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
