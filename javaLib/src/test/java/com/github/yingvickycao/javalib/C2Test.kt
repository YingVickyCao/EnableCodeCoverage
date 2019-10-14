package com.github.yingvickycao.javalib

import org.junit.Assert
import org.junit.Test

class C2Test {

    @Test
    fun doSum() {
        Assert.assertEquals(5, C2().doSum(1, 4).toLong())
    }
}