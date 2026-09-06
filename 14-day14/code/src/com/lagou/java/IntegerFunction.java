package com.lagou.java;

public class IntegerFunction {
    public static void main(String[] args) {
        Integer it1 = new Integer(123);
        System.out.println("it1"+it1); // 自动调用toString()
        Integer it2 = new Integer("456");
        System.out.println("it2"+it2);
        // 上述方法已经过时，使用valueOf方法,相当于从int类型到Integer类型转换
        Integer it3 = Integer.valueOf(123);
        System.out.println("it3"+it3);
        Integer it4 = Integer.valueOf("456");
        System.out.println("it4"+it4);
        // 将Integer转换为int类型。
        int i5 = it4.intValue();
        System.out.println("i5"+i5);

    }
}
