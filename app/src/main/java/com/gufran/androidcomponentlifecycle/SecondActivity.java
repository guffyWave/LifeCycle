package com.gufran.androidcomponentlifecycle;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String TAG = "GUFRAN " + SecondActivity.class.getName();
    int VALUE = 0;

    public SecondActivity() {
        Log.d(TAG, "Constructor ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: VALUE= " + VALUE);
        setContentView(R.layout.activity_second);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: VALUE= " + VALUE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: VALUE= " + VALUE);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: VALUE= " + VALUE);
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: VALUE= " + VALUE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: VALUE= " + VALUE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: VALUE= " + VALUE);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: VALUE= " + VALUE);
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.d(TAG, "onUserInteraction: ");
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.d(TAG, "onUserLeaveHint: VALUE= " + VALUE);
    }

    @Override
    public void finish() {
        super.finish();
        Log.d(TAG, "finish:  VALUE= " + VALUE);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Log.d(TAG, "finalize:  VALUE= " + VALUE);
    }



}
