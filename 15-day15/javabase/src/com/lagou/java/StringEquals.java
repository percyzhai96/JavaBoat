package com.lagou.java;

import java.util.Scanner;
public class StringEquals {
    public static void main(String[] args) {
        // 从键盘输入用户名和密码，使用equals来继续判断
        Scanner sc = new Scanner(System.in);
        for(int i=3;i>0;i--){
            System.out.println("请输入用户名和密码：");
            String username = sc.next();
            String password = sc.next();
            if("admin".equals(username) && "12345".equals(password)){
                System.out.println("登录成功，欢迎使用！");
                break;
            }
            if(i == 1){
                System.out.println("用户已经冻结，请联系客服人员！");
            }else{
                System.out.println("用户名和密码错误，您还有"+(i-1)+"次机会~");
            }
            System.out.println("用户名和密码错误！");
        }
        sc.close();
    }
}
