package net.println.day03.factory;

/**
 * Created by benny on 6/15/16.
 */
public class JustAFactory implements IFactory {
    @Override
    public IProduct createObject(int type) {
        IProduct product;
        switch (type){
            case PRODUCT_TYPE_1:{
                product = new ProductImpl();
            }
            break;
            case PRODUCT_TYPE_2:{
                product = new ProductImpl2();
            }
            break;
            default:{
                throw new IllegalArgumentException("Not support type: " + type);
            }
        }
        return product;
    }
}
