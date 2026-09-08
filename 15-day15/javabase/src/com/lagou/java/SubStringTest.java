package com.lagou.java;

public class SubStringTest {
    public static void main(String[] args) {
        // 构造String类型的数据进行打印
        String str = new String("Happy Wife,Happy Life!");
        System.out.println("str="+str);
        // 取字符串中的一部分并打印
        String str2 = str.substring(12); // 表示从下标12开始取字符串
        System.out.println("str2="+str2);
        String str3 = str.substring(6,10); // 可以取到6取不到10
        System.out.println("str3="+str3);
    }
}
