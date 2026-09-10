package com.lagou.java;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("容量是："+sb1.capacity());
        System.out.println("长度是："+sb1.length());
        // 使用参数指定的长度来构造字符串
        StringBuilder sb2 = new StringBuilder(20);
        System.out.println("容量是："+sb2.capacity());
        System.out.println("长度是："+sb2.length());
        // 根据参数指定的字符串内容
        StringBuilder sb3 = new StringBuilder("hello");
        System.out.println("容量是："+sb3.capacity());
        System.out.println("长度是："+sb3.length());
        // 向字符串中插入和追加
        StringBuilder sb4 = sb3.insert(0,"abc"); // 返回值就是调用对象自己，也就是返回值和调用对象是同一个
        System.out.println("sb4"+sb4);
        System.out.println("sb3"+sb3);
        // 向末尾追加字符串
        sb4.append("def");
        System.out.println("sb4"+sb4);
        sb4.deleteCharAt(1);
        System.out.println(sb4);
    }
}
