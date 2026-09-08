package com.lagou.java;

public class StringPoolTest {
    public static void main(String[] args) {
        // 只有String类比较特殊，除了可以new还可以直接赋值
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
    }
}
