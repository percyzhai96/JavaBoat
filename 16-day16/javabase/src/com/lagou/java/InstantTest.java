package com.lagou.java;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {
    public static void main(String[] args) {
        // 使用Instant类来获取系统的当前时间并不是当前系统的默认时区  本初子午线  差8小时
        Instant now = Instant.now();
        System.out.println("获取到当前的时间是："+now);
        // 加上时区差的8个小时
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("偏移后的日期时间为"+offsetDateTime);
        // 获取当前调用对象距离标准基准时间的毫秒数
        long g1 = now.toEpochMilli();
        System.out.println("获取到的毫秒差："+g1);
        Instant instant = Instant.ofEpochMilli(g1);
        System.out.println(instant);
    }
}
