package com.github.yingvickycao.androidlib

import org.junit.Assert
import org.junit.Test

class B2Test {

    @Test
    fun getB2Value() {
        val b2 = B2(1)
        Assert.assertEquals(b2.b2Value.toLong(), 1)
    }

    @Test
    fun setB2Value() {
        val b2 = B2(1)
        b2.b2Value = 2
        Assert.assertEquals(b2.b2Value.toLong(), 2)
    }
}