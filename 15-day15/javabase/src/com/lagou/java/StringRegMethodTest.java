package com.lagou.java;

public class StringRegMethodTest {
    public static void main(String[] args) {
        String str = "1001,zhangfei,30";
        System.out.println("str1="+str);
        String[] str1 = str.split(",");
        for(int i=0;i< str1.length;i++){
            System.out.println("下标为"+i+"的字符串是"+str1[i]);
        }
        // 进行字符串替换
        String str2= "我的小名叫大帅哥";
        String str3 = str2.replace("我","你");
        System.out.println(str3);
        // 进行字符串内容的替换
        String str4 = "123abc456def789ghi";
        String str5 = str4.replaceFirst("\\d","#");
        System.out.println("替换第一个字符串后的结果是："+str5);

        // 替换全部匹配到的字符
        String str6 = "123abc456def";
        String str7 = str6.replaceAll("\\d","a");
        System.out.println("匹配到的字符全部替换掉："+str7);
    }
}
