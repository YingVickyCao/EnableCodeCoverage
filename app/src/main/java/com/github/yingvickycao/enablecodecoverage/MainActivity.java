package com.github.yingvickycao.enablecodecoverage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.github.yingvickycao.androidlib.Weather;
import com.github.yingvickycao.javalib.Sum;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView sumResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumResult = findViewById(R.id.sumResult);

        findViewById(R.id.pageB).setOnClickListener(view -> pageB());
        printSum();
        useAndroidLib();
    }

    public void pageB() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void printSum() {
        int sum = new Sum().doSum(10, 20);
        sumResult.setText(String.valueOf(sum));
        Log.d(TAG, "printSum: " + sum);
    }

    public void useAndroidLib() {
        Log.d(TAG, "useAndroidLib: " + new Weather("A").getInfo());
    }
}