package com.github.yingvickycao.enablecodecoverage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.github.yingvickycao.androidlib.B2
import com.github.yingvickycao.javalib.C2

class SecondActivity : AppCompatActivity() {
    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        a2();
        b2();
        c2();
    }


    fun a2() {
        val a2 = A2("a1")
        Log.d(TAG, "a2: " + a2.name);
    }

    fun b2() {
        Log.d(TAG, "b2: " + B2(2).b2Value);
    }

    fun c2() {
//        val plus = C2().doSum(10, 20);
//        Log.d(TAG, "c1: $plus")
    }
}