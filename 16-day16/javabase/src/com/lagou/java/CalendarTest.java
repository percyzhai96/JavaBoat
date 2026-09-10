package com.lagou.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        // 1.使用过时的方法按照指定的年月日，时分秒来构造对象
        Date d1 = new Date(2008,8,1,1,1,1);
        // 设置对象的格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        String strTime = sdf.format(d1);
        System.out.println(strTime);
        // 获取Calender类型的引用，
        Calendar instance = Calendar.getInstance();
        // 设置指定的年月日，时分秒信息
        instance.set(2008,8,1,1,1,1);
        // 转换为Date类型的对象
        Date d2 = instance.getTime();
        String format = sdf.format(d2);
        System.out.println(format);
        // 向指定的字段及增加指定的数值
        instance.set(Calendar.YEAR,2018);
        // 转换为Date类型然后打印日期
        Date d3 = instance.getTime();
        String format2 = sdf.format(d3);
        System.out.println(format2);
        // 向指定字段增加值
        instance.add(Calendar.MONTH,2);
        Date d4 = instance.getTime();
        String format3 = sdf.format(d4);
        System.out.println(format3);

    }
}
