package com.smart.utis;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.ContextCompat;


/**
 *
 */

public final class ColorUtil {

    public static int get(Context context, int res) {
        try {
            return ContextCompat.getColor(context, res);
        } catch (Resources.NotFoundException e) {
            return res;
        }
    }
}
