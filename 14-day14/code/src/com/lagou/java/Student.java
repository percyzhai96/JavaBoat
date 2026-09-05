package com.lagou.java;

public class Student {
    private int id;
    private String name;

    public Student(){ }

    public Student (int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
       if(id > 0){
           this.id = id;
       }else{
           System.out.println("学号不合理哦");
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * 比较用户的学号需要对equals进行重写
     * Student s1 = this
     * Object obj = s2
     */

    @Override
    public boolean equals(Object obj){
        // 当参数对象为null调用对象不为空的时候  一定不相同
        if(null == obj) return false;
        // 当调用对象和参数对象属于同一个内容的时候，内容一定相同
        if(this == obj) return true;
        // 首相判断obj是否Student类实例化出来的对象
        if(obj instanceof Student){
            Student ts = (Student) obj;
            // return ts.getId() == this.getId();
            // 使用姓名为基准进行比较需要注意的是String是引用数据类型
            return ts.getName().equals(this.getName());
        }
        // 否则不符合
        return false;
    }

    /*
     * 为了使得该方法的结果与equals的结果保持一致，从而满足官方的常规协定需要。
     */
    @Override
    public int hashCode(){
        int type = 12;
        return this.getName().hashCode()+type*31; // 不再代表内存地址的编号
    }

    /*
     *  为了使toString方法打印的内容更加有意义，对toString进行重写。
     */
    @Override
    public String toString(){
        return "Student[id="+getId()+",name="+getName()+"]";
    }
}
