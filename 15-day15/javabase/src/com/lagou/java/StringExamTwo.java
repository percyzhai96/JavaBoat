package com.lagou.java;

public class StringExamTwo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str2 == str4);
        System.out.println(str2.equals(str4));
        System.out.println("---------------");
        String str5 = "abcd";
        String str6 = "ab"+"cd"; // 常量优化机制，变量不能优化
        System.out.println(str5 == str6); //true

        String str7 = "ab";
        String str8 = str7+"cd";
        System.out.println(str5 == str8); // false   没有常量优化
    }
}
