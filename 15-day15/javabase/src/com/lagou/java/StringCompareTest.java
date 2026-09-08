package com.lagou.java;

public class StringCompareTest {
    public static void main(String[] args) {
        String str = new String("hello");
        System.out.println(str.compareTo("world"));
        System.out.println(str.compareTo("aaaasss"));
        System.out.println(str.compareTo("Hello"));
        System.out.println(str.compareToIgnoreCase("HELLO"));
        System.out.println(str.compareToIgnoreCase("world"));
        System.out.println(str.compareToIgnoreCase("hello"));
    }
}
