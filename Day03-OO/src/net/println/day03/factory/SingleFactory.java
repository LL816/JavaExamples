package net.println.day03.factory;

/**
 * Created by benny on 6/15/16.
 */
public class SingleFactory implements IFactory {

    private IProduct product;

    @Override
    public IProduct createObject() {
        if(product == null){
            product = new ProductImpl();
        }
        return product;
    }

}
