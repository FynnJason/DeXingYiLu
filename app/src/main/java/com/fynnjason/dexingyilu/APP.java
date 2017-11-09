package com.fynnjason.dexingyilu;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
