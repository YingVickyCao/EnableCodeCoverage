package com.github.yingvickycao.javalib;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void doSum() {
        Assert.assertEquals(5, new Sum().doSum(1,4));
    }
}