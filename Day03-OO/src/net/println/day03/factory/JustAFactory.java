package net.println.day03.factory;

/**
 * Created by benny on 6/15/16.
 */
public class JustAFactory implements IFactory {
    @Override
    public IProduct createObject() {
        return new ProductImpl();
    }
}
