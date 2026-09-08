package com.lagou.java;

public class StringFunctionTest {
    public static void main(String[] args) {
        String str = new String("     let me give you some color see!");
        System.out.println("str="+str);
        System.out.println(str.contains("me"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.startsWith(" "));
        System.out.println(str.startsWith("l",5));
        System.out.println(str.endsWith("!"));
    }
}
