package com.lagou.java;

import java.util.Scanner;
public class SubstringExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str1 = sc.next();
        System.out.print("请输入一个字符：");
        String str2 = sc.next();
        int pos = str1.indexOf(str2);
        System.out.println("获取字符所在的位置"+pos);
        String str3 = str1.substring(pos+1);
        System.out.println("打印子字符串="+str3);
    }
}
