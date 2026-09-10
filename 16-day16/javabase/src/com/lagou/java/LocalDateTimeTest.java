package com.lagou.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        // 获取当前日期并打印
        LocalDate now = LocalDate.now();
        System.out.println("获取当前的日期是"+now);
        // 获取当前时间信息并打印
        LocalTime now1 = LocalTime.now();
        System.out.println("获取当前时间是"+now1);
        // 获取当前日期时间信息并打印
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("获取当前的日期时间是"+now2);
        System.out.println("-------------------------------------");
        // 使用参数指定的年月日时分秒来来获取对象并打印
        LocalDateTime of = LocalDateTime.of(2008,8,8,8,8,8);
        System.out.println("指定的日期时间是："+of); // 自动调用toString()
        System.out.println("获取到的年份是："+of.getYear());
        System.out.println("获取到的月份是："+of.getMonthValue());
        System.out.println("获取到的日期是："+of.getDayOfMonth());
        System.out.println("获取到的时是："+of.getHour());
        System.out.println("获取到的分是："+of.getMinute());
        System.out.println("获取到的秒是："+of.getSecond());
        System.out.println("-------------------------------------");
        LocalDateTime localDateTime = of.withYear(2012);
        System.out.println(localDateTime);
        // 和String类型相似，调用对象的本身内容不会改变，返回值是创建了一个新的对象，因此证明了不可变性
        System.out.println(of);
        LocalDateTime localDateTime1 = of.withMonth(9);
        System.out.println(localDateTime1);
        // 实现特征的增加并打印
        LocalDateTime localDateTime2 = localDateTime1.plusDays(2);
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = localDateTime2.plusHours(9);
        System.out.println(localDateTime3);
        // 实现特征的减少并打印
        LocalDateTime localDateTime4 = localDateTime3.minusMinutes(8);
        System.out.println(localDateTime4);
        LocalDateTime localDateTime5 = localDateTime4.minusSeconds(6);
        System.out.println(localDateTime5);
    }
}
