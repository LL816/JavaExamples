package net.println.day01;

/**
 * Created by benny on 6/12/16.
 */
public class StringBuilderDemo {
    public static void main(String... args) {
        StringBuilder stringBuilder = new StringBuilder("init");
        stringBuilder.append("Hello")
                .append('\n')
                .append(5);
        String str = stringBuilder.toString();
        System.out.println(str);
    }
}
