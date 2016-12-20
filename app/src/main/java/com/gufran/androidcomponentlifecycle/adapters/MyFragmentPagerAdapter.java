package com.gufran.androidcomponentlifecycle.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.gufran.androidcomponentlifecycle.SecondActivity;
import com.gufran.androidcomponentlifecycle.fragments.FragmentOne;
import com.gufran.androidcomponentlifecycle.fragments.FragmentThree;
import com.gufran.androidcomponentlifecycle.fragments.FragmentTwo;

import java.util.List;

/**
 * Created by gufran on 12/19/16.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    Context context;
    List<Fragment> fragmentList;

    String TAG = "GUFRAN " + MyFragmentPagerAdapter.class.getName();


//    public MyFragmentPagerAdapter(FragmentManager fragmentManager, Context context) {
//        super(fragmentManager);
//        this.context = context;
//        Log.d(TAG, "Constructor ");
//    }

    public MyFragmentPagerAdapter(FragmentManager fragmentManager, Context context, List<Fragment> fragmentList) {
        super(fragmentManager);
        this.context = context;
        this.fragmentList = fragmentList;
        Log.d(TAG, "Constructor ");
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
//        switch (position) {
//            case 0:
//                return new FragmentOne();
//            case 1:
//                return new FragmentTwo();
//
//            case 2:
//                return new FragmentThree();
//
//            default:
//                return null;
        //       }
    }

    @Override
    public int getCount() {
        return fragmentList.size();
        // return 3;
    }
}
