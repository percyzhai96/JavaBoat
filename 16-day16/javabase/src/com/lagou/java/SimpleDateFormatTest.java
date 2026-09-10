package com.lagou.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws Exception {
        // 获取当前系统时间并打印
        Date d1 = new Date();
        System.out.println(d1);
        // 构造SimpleDateFormat类型的对象并指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
        String format = sdf.format(d1);
        System.out.println(format);
        // 实现日期类型到文本类型的转换
        Date parse = sdf.parse(format);
        System.out.println("转回日期的结果为"+parse);
    }
}
