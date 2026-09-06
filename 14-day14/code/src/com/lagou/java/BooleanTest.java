package com.lagou.java;

public class BooleanTest {
    public static void main(String[] args) {
        // 在Java5之前进行装箱和拆箱
        Boolean bo1 = Boolean.valueOf(false); // 装箱
        boolean bo2 = bo1.booleanValue(); // 拆箱
        System.out.println(bo2);
        // 从java5开始支持自动装箱和拆箱
        Boolean bo3 = false;
        boolean bo4 = bo3;
        System.out.println(bo4);
        // 实现从String类型到Boolean类型的转换
        boolean bo5 = Boolean.parseBoolean("true");
        System.out.println(bo5);
    }
}
