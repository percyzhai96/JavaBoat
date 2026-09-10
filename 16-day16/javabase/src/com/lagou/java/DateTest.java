package com.lagou.java;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("使用当前系统时间"+d1);
        // 使用有参构造
        Date d2 = new Date(1000);
        System.out.println("距离1970年1月1日0时0分0秒的时间为"+d2);
        // 获取调用对象距离1970年1月1日0时0分0秒的毫秒数
        long msec = d2.getTime();
        System.out.println("获取到的毫秒数为："+msec);
        // 设置调用对象所指定的时间点
        d2.setTime(2000);
        System.out.println("修改后的时间"+d2);
    }
}
