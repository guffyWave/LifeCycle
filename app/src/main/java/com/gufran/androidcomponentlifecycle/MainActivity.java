package com.gufran.androidcomponentlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


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
}
