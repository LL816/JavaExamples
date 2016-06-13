package net.println.day01;

import java.lang.reflect.Field;

/**
 * Created by benny on 6/12/16.
 */
public class StringDemo1 {
    public static void main(String[] args) {
        try {
            String a = "Hello World";

            Field f = String.class.getDeclaredField("value");
            f.setAccessible(true);
            String b = "Modified!!";
            f.set(a, b.toCharArray());
            System.out.println(a);
            System.out.println(a == b);
            System.out.println(a.equals(b));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
