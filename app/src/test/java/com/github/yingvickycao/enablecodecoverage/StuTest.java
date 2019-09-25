package com.github.yingvickycao.enablecodecoverage;

import org.junit.Assert;
import org.junit.Test;

public class StuTest {

    @Test
    public void getName() {
        Stu stu = new Stu("A");
        Assert.assertEquals("A", stu.getName());
    }
}