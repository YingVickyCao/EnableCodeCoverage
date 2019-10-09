package com.github.yingvickycao.enablecodecoverage

import org.junit.Assert
import org.junit.Test

class A2Test {

    @Test
    fun getName() {
        val stu = A2("A1")
        Assert.assertEquals("A1", stu.name)
    }
}