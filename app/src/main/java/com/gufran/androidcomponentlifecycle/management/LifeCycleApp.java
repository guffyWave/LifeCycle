package com.gufran.androidcomponentlifecycle.management;

import android.app.Application;
import android.util.Log;

import com.gufran.androidcomponentlifecycle.fragments.FragmentTwo;

/**
 * Created by gufran on 12/20/16.
 */

public class LifeCycleApp extends Application {

    String TAG = "GUFRAN " + LifeCycleApp.class.getName();

    public LifeCycleApp() {
        Log.d(TAG, "LifeCycleApp: constructor");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Log.d(TAG, "finalize: ");
    }
}
