package net.println.day01;

/**
 * Created by benny on 6/12/16.
 */
public class StringBufferDemo {
    public static void main(String... args) {
        StringBuffer stringBuffer = new StringBuffer("init");
        stringBuffer.append("Hello")
                .append('\n')
                .append(5);
        String str = stringBuffer.toString();
        System.out.println(str);
    }
}
