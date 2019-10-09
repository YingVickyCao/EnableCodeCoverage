package com.github.yingvickycao.enablecodecoverage

import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class SecondActivityTest {

    @get:Rule
    var activityRule = ActivityTestRule(SecondActivity::class.java)

    @Test
    fun initStu() {
        activityRule.activity.initStu()
    }
}