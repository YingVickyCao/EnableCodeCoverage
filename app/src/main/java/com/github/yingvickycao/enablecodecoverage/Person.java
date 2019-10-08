

package com.github.yingvickycao.enablecodecoverage;

public class Person {
    public String name;
    private int n = 3;
    private int m = 5;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void handleStu(Stu stu) {
        if (null == stu) {
            System.out.println(stu.toString());
        }

        if (null == stu) {
            System.out.println(stu.toString());
        }
        
        n = m;
        /**
         * (Constanst.ONE == 1){
         *  System.out.println(Constanst.ONE);
         * }
         */
    }
}
