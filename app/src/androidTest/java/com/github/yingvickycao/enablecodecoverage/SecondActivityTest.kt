package com.github.yingvickycao.enablecodecoverage

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Assert
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class SecondActivityTest {

    @get:Rule
    var activityRule = ActivityTestRule(SecondActivity::class.java)

    @Test
    fun initStu() {
//        val stu = Stu("B")
//        Assert.assertEquals("B", stu.name)

        Assert.assertEquals("S", activityRule.activity.initStu().getName())
    }
}