package net.println.day03.factory;

/**
 * Created by benny on 6/15/16.
 */
class ProductImpl implements IProduct{

    @Override
    public void onMinimized() {
        System.out.println("onMinimized");
    }

    @Override
    public void onMaximized() {
        System.out.println("onMaximized");
    }
}
