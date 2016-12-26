package com.gufran.androidcomponentlifecycle.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by gufran on 12/22/16.
 */

public class MyService extends Service {

    String TAG = "GUFRAN " + MyService.class.getName();

    private final IBinder mBinder = new MyBinder();
    private Messenger outMessenger;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Bundle extras = intent.getExtras();
        Log.d(TAG, "onBind:");
        // Get message from the Activity
        if (extras != null) {
            Log.d(TAG, "onBind with extra");
            outMessenger = (Messenger) extras.get("MESSENGER");
        }
        return mBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind: ");
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d(TAG, "onRebind: ");
        super.onRebind(intent);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.d(TAG, "onStart: ");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    public void myMethod() {
        Log.d(TAG, "myMethod: ");
    }

    public class MyBinder extends Binder {
        public MyService getService() {
            return MyService.this;
        }
    }
}

