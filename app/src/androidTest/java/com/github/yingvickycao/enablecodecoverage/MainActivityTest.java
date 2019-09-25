package com.github.yingvickycao.enablecodecoverage;


import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Test
    public void initPerson() {
        Person person = new Person("B");
        Assert.assertEquals("B", person.getName());

//        new MainActivity().initPerson();
    }
}