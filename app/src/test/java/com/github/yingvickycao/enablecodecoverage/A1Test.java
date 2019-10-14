package com.github.yingvickycao.enablecodecoverage;

import org.junit.Assert;
import org.junit.Test;

public class A1Test {

    @Test
    public void getName() {
        A1 a1 = new A1("A1");
        Assert.assertEquals("A1", a1.getName());
        a1.handleInfo("123");
    }
}