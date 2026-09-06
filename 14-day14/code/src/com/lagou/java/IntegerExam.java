package com.lagou.java;

public class IntegerExam {
    public static void main(String[] args) {
        Integer it6 = 127;
        Integer it7 = 127;
        Integer it8 = new Integer(127);
        Integer it9 = new Integer(127);
        System.out.println(it6 == it7);      // false
        System.out.println(it6.equals(it7)); // true
        System.out.println(it8 == it9); // false
        System.out.println(it8.equals(it9)); // true
    }
}
