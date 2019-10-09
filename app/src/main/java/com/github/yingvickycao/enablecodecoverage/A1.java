

package com.github.yingvickycao.enablecodecoverage;

public class A1 {
    public String name;
    private int n = 3;
    private int m = 5;

    public A1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void handleInfo(String info) {
        if (null == info) {
            System.out.println(info.toString());
        }

        if (null == info) {
            System.out.println(info.toString());
        }
        
        n = m;
        /**
         * (Constanst.ONE == 1){
         *  System.out.println(Constanst.ONE);
         * }
         */
    }
}
