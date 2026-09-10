package com.lagou.java;

public class SeachReplace {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello-world-ni-hao");
        sb1.setCharAt(1,'a'); // 修改单个字符的功能
        System.out.println(sb1);
        sb1.replace(1,3,"000");
        System.out.println(sb1);
        // 实现查找的功能
        int pos = sb1.indexOf("h");
        System.out.println(pos);
        int lastPos = sb1.lastIndexOf("h");
        System.out.println(lastPos);
        // 实现字符串的反转
        sb1.reverse();
        System.out.println(sb1);
        String str = sb1.toString();
    }
}
