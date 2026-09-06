package com.lagou.java;

public class CharTest {
    public static void main(String[] args) {
        // 从java5之前手动实现装箱和拆箱
        Character ca1 = Character.valueOf('a'); // 装箱
        System.out.println("ca1="+ca1);
        char ca2 = ca1.charValue(); // 拆箱
        System.out.println("ca2="+ca2);
        // java5开始完成了自动装箱和拆箱
        Character ca3 = 'b';
        char ca4 = ca3;
        System.out.println("ca4="+ca4);
        // 实现字符类型的转换和判断
        System.out.println(Character.isUpperCase(ca1)); // 判断是否是大写字符
        System.out.println(Character.isLowerCase(ca1)); // 判断是否是小写字符
        System.out.println(Character.isDigit(ca1)); // 判断是否是数字字符
        System.out.println("转换为大写字符:"+Character.toUpperCase(ca2));
        System.out.println("转换为小写字符:"+Character.toLowerCase(ca2));

    }
}
