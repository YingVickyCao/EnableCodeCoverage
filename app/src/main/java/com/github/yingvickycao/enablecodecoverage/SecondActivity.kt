package com.github.yingvickycao.enablecodecoverage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        initStu();
    }

    fun initStu(): Stu {
        val stu = Stu("S")
        Log.d(TAG, "initStu: " + stu.name)
        return stu
    }
}