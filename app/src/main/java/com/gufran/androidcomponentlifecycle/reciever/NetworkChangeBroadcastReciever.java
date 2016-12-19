package com.gufran.androidcomponentlifecycle.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import com.gufran.androidcomponentlifecycle.SecondActivity;

/**
 * Created by gufran on 12/13/16.
 */

public class NetworkChangeBroadcastReciever extends BroadcastReceiver {

    String TAG = "GUFRAN " + NetworkChangeBroadcastReciever.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean isWifiConnected = false;
        boolean isMobileDataConnected = false;

        NetworkInfo wifi = connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        isWifiConnected = (wifi != null && wifi.isConnectedOrConnecting());

        NetworkInfo mobile = connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        isMobileDataConnected = (mobile != null && mobile.isConnectedOrConnecting());

        if (isWifiConnected == true || isMobileDataConnected == true) {
            Log.d(TAG, " Network Available YES");
//            Intent startIntent = new Intent(context, SecondActivity.class);
//            startIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(startIntent);
        } else {
            Log.d(TAG, " Network Available NO");
        }
    }
}
