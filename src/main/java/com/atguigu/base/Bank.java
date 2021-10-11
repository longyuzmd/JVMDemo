package com.atguigu.base;

public class Bank {

    // 私有化构造器
    private Bank(){

    }

    private static Bank b = new Bank();

    public static Bank getInstance(){
        return b;
    }
}
