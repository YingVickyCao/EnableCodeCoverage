package com.github.yingvickycao.enablecodecoverage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.yingvickycao.androidlib.B1;
import com.github.yingvickycao.javalib.C1;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.pageB).setOnClickListener(view -> pageB());
        a1();
        b1();
        c1();
    }

    public void pageB() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void a1() {
        A1 a1 = new A1("a1");
        Log.d(TAG, "a1: " + a1.getName());
    }

    public void b1() {
        Log.d(TAG, "b1: " + new B1("b1").getB1Value());
    }

    public void c1() {
        int plus = new C1().plus(10);
        Log.d(TAG, "c1: " + plus);
    }
}