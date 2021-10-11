package com.atguigu.base;

import org.junit.Test;

import java.util.Scanner;

public class TestVar {

//    int myNum1;
//
//    public static void main(String[] args) {
//        int myNum = 0;
//        System.out.println(myNum);
//
//
//    }
    @Test
    public void test(){
//        System.out.println(myNum1);

        byte i = 0;
        char a = 'a';
        int b = i+a;
        System.out.println(b);
    }

    @Test
    public void test1(){
        int a = 123;

        int i = a / 100; // 百位
        int j = a % 100 / 10; // 十位
        int k = a % 10; // 个位
        System.out.println("百位"+i + "十位"+ j + "个位"+ k);
    }

    @Test
    public void test2(){
        byte a = 10;

        a += 128;

        System.out.println(a); // -118
    }

    @Test
    public void test3(){
        int n = 10;

        n += (n++) + (++n);

        System.out.println(n);
    }

    @Test
    public void test4(){
        int x = 1; int y = 1;
        if(x++ == 2 && ++y == 2){
            x = 7;
        }
        System.out.println(x + "====" + y);
    }

    @Test
    public void test5(){
        int x = 1; int y = 1;
        if(x++ == 2 & ++y == 2){
            x = 7;
        }
        System.out.println(x + "====" + y);
    }

    @Test
    public void test6(){
        int num1 = 12;
        int num2 = 5;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println(num1 + "====" + num2);
    }

    @Test
    public void test7(){
//        // for 循环
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//        // while 循环
//        int j = 0;
//        while(j<100){
//            System.out.println(j);
//            j++;
//        }

        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while (k<100 && k >= 1);


    }

    @Test
    public void test8(){
        for (int i = 0; i < 4; i++) {
            for (int j = 4-(i+1);j < 4;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /**
     * 1*1=1
     * 1*2=2 2*2=4
     * 1*3=3 2*3=6 3*3=9
     */
    @Test
    public void test9(){
        int i;
        int j;
        for ( i = 1; i <= 9; i++) {
            for (j = 1;j <= i;j++){
                System.out.print(""+j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int zCount = 0;

        int fCount = 0;

        while(true){
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();

            if(num > 0){
                zCount++;
            }else if( num < 0){
                fCount++;
            }else{
                System.out.println("正数："+zCount + "负数："+fCount);
                break;
            }
        }
    }

    @Test
    public void test10(){
        // 多态性 体现
        Person p = new Student();

        p.eat();
        p.walk();

        function(new Student());
    }

    @Test
    public void test11(){
        // 多态性 体现
        Person p = new Person();
        p.setName("zuomingdeng");
        p = null;
        System.gc();
    }

    public void function(Person p){
        p.walk();
        p.eat();
    }


    @Test
    public void test12(){
        // 基本数据类型-----> 包装类型
        Integer integer = new Integer(12);
        Integer i = 13; // 自动装箱
        Integer i1 = Integer.valueOf(13); // 自动装箱

        Float f = 12.5f;


        // 包装类型-----> 基本数据类型 xxxValue() 方法
        int i2 = integer.intValue();

        float v = f.floatValue();

        // 基本数据类型、包装类型---->String类型  valueOf()
        String s = 12 + "";
        String s1 = String.valueOf(integer);

        // String-----> 基本数据类型、包装类型  parseXXX()
        int i3 = Integer.parseInt("123");
        float v1 = Float.parseFloat("12.4f");
    }

    @Test
    public void test13(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1); // 1.0
    }

    @Test
    public void test14(){
        BankActivityDemo bankActivityDemo = new BankActivityDemo();
        bankActivityDemo.function();
    }
}
