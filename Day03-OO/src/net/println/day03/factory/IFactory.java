package net.println.day03.factory;

/**
 * Created by benny on 6/15/16.
 */
public interface IFactory {

    public static final int PRODUCT_TYPE_1 = 1;
    public static final int PRODUCT_TYPE_2 = 2;

    IProduct createObject(int type);

}
