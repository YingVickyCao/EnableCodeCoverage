package com.github.yingvickycao.enablecodecoverage;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getName() {
        Person person = new Person("A");
        Assert.assertEquals("A", person.getName());
        person.handleStu(new Stu("stu"));
    }
}