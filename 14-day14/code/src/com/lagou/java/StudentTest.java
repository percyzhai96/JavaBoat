package com.lagou.java;

public class StudentTest {
    public static void main(String[] args) {
        // 使用有参构造方式Student类型的两个对象判断是否相等。
        Student s1 = new Student(1001,"zhangfei");
        Student s2 = new Student(1001,"zhangfei");
        // 下面是从Object继承下下的equals，默认比较的内存地址。
        boolean b = s1.equals(s2);
        System.out.println("比较两个数据的值："+b); // true：两个地址不一致,但对equals进行了重写，内容一致
        System.out.println(s1 == s2); // false
        // hashcode用来获取地址编码
        int hashcode = s1.hashCode();
        int hashcode2 = s2.hashCode();
        System.out.println(hashcode == hashcode2); // true
        // 调用从Object类下继承来的toString方法。
        String str = s1.toString();
        System.out.println(str); // Student[id=1001,name=zhangfei]
    }
}
