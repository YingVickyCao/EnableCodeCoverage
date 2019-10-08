package com.github.yingvickycao.enablecodecoverage

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import org.junit.Assert
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class SecondActivityTest {

//    @Test
//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
//        Assert.assertEquals("com.github.yingvickycao.enablecodecoverage", appContext.packageName)
//    }
//

    @get:Rule
    var activityRule = ActivityTestRule(SecondActivity::class.java)

    @Test
    fun initStu() {
        activityRule.activity.initStu()
    }
}