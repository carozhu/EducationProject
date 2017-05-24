package edu.smart.utis;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

/**
 * Created by caro on 2017/3/2.
 */

public class SharedPreferencesCompat {
    public static class EditorCompat {

        private static EditorCompat sInstance;

        private interface Helper {
            void apply(@NonNull SharedPreferences.Editor editor);
        }

        private static class EditorHelperBaseImpl implements Helper {

            @Override
            public void apply(@NonNull SharedPreferences.Editor editor) {
                editor.commit();
            }
        }

        /**
         * 忽略API9
         */
        /*private static class EditorHelperApi9Impl implements Helper {

            @Override
            public void apply(@NonNull SharedPreferences.Editor editor) {
                EditorCompatGingerbread.apply(editor);
            }
        }*/

        private final Helper mHelper;

        private EditorCompat() {
            //if (Build.VERSION.SDK_INT >= 9) {
            //    mHelper = new EditorHelperApi9Impl();
            //} else
            {
                mHelper = new EditorHelperBaseImpl();
            }
        }

        public static EditorCompat getInstance() {
            if (sInstance == null) {
                sInstance = new EditorCompat();
            }
            return sInstance;
        }

        public void apply(@NonNull SharedPreferences.Editor editor) {
            mHelper.apply(editor);
        }
    }
}
