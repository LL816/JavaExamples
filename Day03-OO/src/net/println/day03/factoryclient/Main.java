package net.println.day03.factoryclient;

import net.println.day03.factory.IFactory;
import net.println.day03.factory.IProduct;
import net.println.day03.factory.SingleFactory;

/**
 * Created by benny on 6/15/16.
 */
public class Main {

    static IFactory factory = new SingleFactory();

    public static void main(String... args) {
        IProduct product = factory.createObject(IFactory.PRODUCT_TYPE_1);
        IProduct product1 = factory.createObject(IFactory.PRODUCT_TYPE_2);
        //...
        System.out.println(product);
        System.out.println(product1);
    }
}
