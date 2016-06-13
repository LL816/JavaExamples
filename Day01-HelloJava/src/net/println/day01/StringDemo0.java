package net.println.day01;

/**
 * Created by benny on 6/12/16.
 */
public class StringDemo0 {
    public static void main(String[] args) {

        String a = "Hello World";
        String c = new String("Hello World");
        String d = c.intern();
        String b = "Hello World";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(c == d);
    }

}
