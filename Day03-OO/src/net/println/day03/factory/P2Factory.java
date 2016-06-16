package net.println.day03.factory;

/**
 * Created by benny on 6/15/16.
 */
public class P2Factory implements IFactory {
    @Override
    public IProduct createObject(int type) {
        return new ProductImpl2();
    }
}
