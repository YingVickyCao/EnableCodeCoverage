package com.github.yingvickycao.javalib;

import org.junit.Assert;
import org.junit.Test;


public class PlusTest {

    @Test
    public void plus() {
        Assert.assertEquals(2,new Plus().plus(1));
    }
}