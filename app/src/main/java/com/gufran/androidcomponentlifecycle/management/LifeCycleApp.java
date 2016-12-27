package com.gufran.androidcomponentlifecycle.management;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

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

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    //Called when the overall system is running low on memory, and actively running processes should trim their memory usage
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Log.d(TAG, "finalize: ");
    }
}
