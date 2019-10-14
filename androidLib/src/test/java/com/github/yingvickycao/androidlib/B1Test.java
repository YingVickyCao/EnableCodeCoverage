package com.github.yingvickycao.androidlib;

import org.junit.Assert;
import org.junit.Test;

public class B1Test {

    @Test
    public void getB1Value() {
        B1 b1 = new B1("Cloudy");
        Assert.assertEquals(b1.getB1Value(), "Cloudy");
    }

    @Test
    public void setB1Value() {
        B1 b1 = new B1("Rain");
        b1.setB1Value("Cloudy");
        Assert.assertEquals(b1.getB1Value(), "Cloudy");
    }
}