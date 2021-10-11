package com.atguigu.base;

abstract class BankActivityTemplate{
    private void getTicket(){
        System.out.println("挂号");
    }
    public abstract void handle();
    private void evaulation(){
        System.out.println("评价");
    }
    public void function(){
        getTicket();
        handle();
        evaulation();
    }
}