package net.println.day03.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by benny on 6/15/16.
 */
public class SingleFactory implements IFactory {

    private Map<Integer, IProduct> map = new HashMap<>();

    private JustAFactory justAFactory = new JustAFactory();

    @Override
    public IProduct createObject(int type) {
        IProduct product = map.get(type);
        if(product == null){
            product = justAFactory.createObject(type);
            map.put(type, product);
        }
        return product;
    }

}
