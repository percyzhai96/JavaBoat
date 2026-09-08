package com.lagou.java;

public class StringJudgeTest {
    public static void main(String[] args) {
        // 创建字符串并打印
        String str = new String("上海自来水来自海上");
        System.out.println("打印字符串"+str);
        // 判断字符串是否为回文
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("不是回文数！");
                return;
            }
        }
        System.out.println("是回文数！");
    }
}
