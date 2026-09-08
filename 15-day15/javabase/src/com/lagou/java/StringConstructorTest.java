package com.lagou.java;

public class StringConstructorTest {
    public static void main(String[] args) {
        // 使用无参构造
        String str1 = new String();
        System.out.println("打印无参构造的字符串"+str1);
        // 使用参数指定的byte数组来构造打印对象
        byte[] arr = {97,98,99,100,101,102};
        String str2 = new String(arr,1,3);
        // 构造字符串的思路就是先将每个整数翻译成对应的字符，再将所有字符连起来。
        System.out.println("打印字节数组构造的字符串"+str2);
        // 使用整个字节数组构造字符串
        String str3 = new String(arr);
        System.out.println("打印完整字节数组构造的字符串"+str3);
        // 使用字符数组构造字符串
        char [] ch = {'h','e','l','l','o'};
        String str4 = new String(ch,1,3);
        System.out.println("打印字符数组构造的字符串"+str4);
        // 使用整个字符数组来构造对象
        String str5 = new String(ch);
        System.out.println("打印整个字符数组构造的字符串"+str5);
        // 使用字符串来构造字符串对象
        String str6 = new String("HelloWorld!");
        System.out.println("打印字符串"+str6);
    }
}
