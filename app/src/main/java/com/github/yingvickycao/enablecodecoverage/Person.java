package com.github.yingvickycao.enablecodecoverage;


import android.util.Log;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        Log.d("Person", "getName: "+ name);
        Log.d("Person", "getName: "+ name);
        return name;
    }
}
