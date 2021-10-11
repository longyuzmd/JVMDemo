package com.atguigu.base;

import java.util.ArrayList;

public class TestJStat {

    public static void main(String[] args) {

        ArrayList<byte[]> bytes = new ArrayList<byte[]>();

        for (int i = 0; i < 1000; i++) {

            byte[] byteArr = new byte[1024*100]; //100k

            bytes.add(byteArr);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(bytes);
    }
}
