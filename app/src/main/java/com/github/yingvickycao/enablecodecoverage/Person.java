package com.github.yingvickycao.enablecodecoverage;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Person," + name);
        System.out.println("Person," + name);
        return name;
    }
    
    public void handleStu(Stu stu){
        System.out.println(stu.toString());
    }
}
