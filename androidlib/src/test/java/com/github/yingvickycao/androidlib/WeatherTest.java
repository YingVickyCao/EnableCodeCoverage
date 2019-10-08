package com.github.yingvickycao.androidlib;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherTest {

    @Test
    public void getInfo() {
        Weather weather = new Weather("Cloudy");
        Assert.assertEquals(weather.getInfo(), "Cloudy");
    }

    @Test
    public void setInfo() {
        Weather weather = new Weather("Rain");
        weather.setInfo("Cloudy");
        Assert.assertEquals(weather.getInfo(), "Cloudy");
    }
}