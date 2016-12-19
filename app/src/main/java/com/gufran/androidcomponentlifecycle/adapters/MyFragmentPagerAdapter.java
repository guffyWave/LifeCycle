package com.gufran.androidcomponentlifecycle.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.gufran.androidcomponentlifecycle.SecondActivity;

import java.util.List;

/**
 * Created by gufran on 12/19/16.
 */

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
    Context context;
    List<Fragment> fragmentList;

    String TAG = "GUFRAN " + MyFragmentPagerAdapter.class.getName();


    public MyFragmentPagerAdapter(FragmentManager fragmentManager, Context context, List<Fragment> fragmentList) {
        super(fragmentManager);
        this.context = context;
        this.fragmentList = fragmentList;
        Log.d(TAG, "Constructor ");
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
