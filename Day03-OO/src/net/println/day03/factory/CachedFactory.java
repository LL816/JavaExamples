package net.println.day03.factory;

import java.util.ArrayList;

/**
 * Created by benny on 6/15/16.
 */
public class CachedFactory implements IFactory {

    ArrayList<IProduct> products = new ArrayList<>(5);

    @Override
    public IProduct createObject() {
        IProduct product = new ProductImpl();
        products.add(product);
        return product;
    }
}
