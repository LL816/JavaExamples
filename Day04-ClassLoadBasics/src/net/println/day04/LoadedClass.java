package net.println.day04;

/**
 * Created by benny on 6/16/16.
 */
public class LoadedClass {
    int b;
    int a = 2;
    ReferredClass referredClass;
    {
        b = 54;
        System.out.println("init before the constructor!");
    }

    String str;
    public LoadedClass() {
        str = "abc";
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
        System.out.println("init!!");
        try {
            Class.forName("net.println.day04.ReferredClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("before ReferredClass");
        referredClass = new ReferredClass();
    }

    {
        System.out.println("init after the constructor!!");
        System.out.println(b);
    }

    int c = 5;

    static {
        System.out.println("cinit!!");
    }
}
