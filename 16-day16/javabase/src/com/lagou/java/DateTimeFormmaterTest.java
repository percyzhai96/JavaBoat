package com.lagou.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormmaterTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = dateTimeFormatter.format(now);
        System.out.println("调整后的格式是："+str);
        // 实现字符串到日期的打印
        TemporalAccessor parse = dateTimeFormatter.parse(str);
        System.out.println("调整的格式是："+parse);
    }
}
