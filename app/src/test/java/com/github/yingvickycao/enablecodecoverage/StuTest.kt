package com.github.yingvickycao.enablecodecoverage

import org.junit.Assert
import org.junit.Test

class StuTest {

    @Test
    fun getName() {
        val stu = Stu("A")
        Assert.assertEquals("A", stu.name)
    }
}