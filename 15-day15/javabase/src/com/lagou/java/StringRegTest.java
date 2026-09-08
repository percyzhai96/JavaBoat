package com.lagou.java;

import java.util.Scanner;
public class StringRegTest {
    public static void main(String[] args) {
        String reg = "^[0-9]{6}$";
        System.out.print("请输入您的银行卡密码：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 判断用户输入的字符串内容是否满足指定的规则
        if(str.matches(reg)){
            System.out.println("银行卡密码的格式正确！");
        }else{
            System.out.println("银行卡密码的格式不正确");
        }
    }
}
