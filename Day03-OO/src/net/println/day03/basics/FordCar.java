package net.println.day03.basics;

/**
 * Created by benny on 6/14/16.
 */
public final class FordCar extends AbsCar {

    @Override
    protected void runLikeACharm() {
        System.out.println("This is a Ford.");
    }

    public static void main(String... args) {
        ICar car = new FordCar();
        car.run();
    }
}
