package com.gufran.androidcomponentlifecycle;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.gufran.androidcomponentlifecycle.service.MyService;

public class MainActivity extends AppCompatActivity {

    private MyService myServiceBinder;

    String TAG = "GUFRAN " + MainActivity.class.getName();

    public ServiceConnection myConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder binder) {
            myServiceBinder = ((MyService.MyBinder) binder).getService();
            Log.d(TAG, " ServiceConnection connected");
            showServiceData();
        }

        public void onServiceDisconnected(ComponentName className) {
            Log.d(TAG, "ServiceConnection  disconnected");
            myServiceBinder = null;
        }
    };

    public Handler myHandler = new Handler() {
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            Log.d(TAG, "handleMessage: " + data.toString());
        }
    };

    private void showServiceData() {
        myServiceBinder.myMethod();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOne(View v) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }

    public void onClickTwo(View v) {
        startActivity(new Intent(MainActivity.this, ThirdActivity.class));
    }

    public void onClickThree(View v) {
        startActivity(new Intent(MainActivity.this, FourthActivity.class));
    }

    public void onClickFour(View v) {
        if (myServiceBinder == null) {
            doBindService();
        }
//        if (myService != null) {
//            unbindService(myConnection);
//            myService = null;
//        }
    }



    public void doBindService() {
        Intent intent = null;
        intent = new Intent(this, MyService.class);
        // Create a new Messenger for the communication back
        // From the Service to the Activity
        Messenger messenger = new Messenger(myHandler);
        intent.putExtra("MESSENGER", messenger);

        bindService(intent, myConnection, Context.BIND_AUTO_CREATE);
    }



}
