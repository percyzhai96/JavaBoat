package com.lagou.java;

public class StringIndexTest {
    public static void main(String[] args) {
        String str =  "Good Good Study, Day Day Up!";
        // 实现字符串的查找功能
        int pos = 0;
        while((pos = str.indexOf("Day",pos)) != -1){
            System.out.println("pos="+pos);
            pos+="Day".length();
        }
        System.out.println(str.lastIndexOf('G',5));
        System.out.println(str.lastIndexOf("Day",5));
    }
}
