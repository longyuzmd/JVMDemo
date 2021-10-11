package com.atguigu.base;

public class Person {

    private String name;

    private int age;

    final int id = 1001;

    // 无参数的构造器
    public Person(){
        this.age = 18;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("人 吃饭");
    }

    public void walk(){
        System.out.println("人 走路");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾回收"+this);
    }
}
