package com.github.yingvickycao.enablecodecoverage;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Person," + name);
        System.out.println("Person," + name);
        return name;
    }

    public void handleStu(Stu stu){
        if (null == stu){
            System.out.println(stu.toString());
        }
    }
}
