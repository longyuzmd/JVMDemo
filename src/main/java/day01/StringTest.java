package day01;

import java.lang.String;

public class StringTest {
    private String str = "good";
    char[] c = {'t','e','s','t'};

    public void change(String str,char[] c){
        str = "test ok";
        c[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str,ex.c);
        System.out.println(ex.str);
        System.out.println(ex.c);
    }
}
