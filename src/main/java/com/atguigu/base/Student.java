package com.atguigu.base;

public class Student extends Person {

    private String className;

    int id = 1002;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }
}

/**
 * 区别方法的重载和重写
 *
 */
