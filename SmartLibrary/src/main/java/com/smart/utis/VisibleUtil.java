package edu.smart.utis;

import android.view.View;

/**
 * Created by jrvansuita on 20/02/17.
 */

public final class VisibleUtil {

    public static void handle(View v, String s) {
        v.setVisibility(s == null || s.isEmpty() ? View.GONE : View.VISIBLE);
    }
}
