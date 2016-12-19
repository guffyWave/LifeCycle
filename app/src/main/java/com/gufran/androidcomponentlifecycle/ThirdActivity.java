package com.gufran.androidcomponentlifecycle;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.gufran.androidcomponentlifecycle.fragments.FragmentOne;
import com.gufran.androidcomponentlifecycle.fragments.FragmentTwo;

public class ThirdActivity extends AppCompatActivity {

    String TAG = "GUFRAN " + ThirdActivity.class.getName();
    int VALUE = 0;
    FrameLayout frameLayout;

    FragmentManager fragmentManager;
    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;

    public ThirdActivity() {
        Log.d(TAG, "Constructor ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: VALUE= " + VALUE);
        setContentView(R.layout.activity_third);

        frameLayout = (FrameLayout) findViewById(R.id.containerFrameLayout);

        fragmentManager = getSupportFragmentManager();
    }

    public void onClickOne(View v) {

        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentOne = new FragmentOne();
        fragmentTransaction.replace(R.id.containerFrameLayout, fragmentOne, "FRAGMENT_ONE");
        //fragmentTransaction.addToBackStack("FRAGMENT_ONE");
        fragmentTransaction.commit();
    }


    public void onClickTwo(View v) {
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTwo = new FragmentTwo();
        fragmentTransaction.replace(R.id.containerFrameLayout, fragmentTwo, "FRAGMENT_TWO");
        // fragmentTransaction.addToBackStack("FRAGMENT_TWO");
        fragmentTransaction.commit();
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
