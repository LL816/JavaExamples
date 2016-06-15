package net.println.day03.basics;

/**
 * Created by benny on 6/14/16.
 */
public abstract class AbsCar implements ICar {
    @Override
    public final void run() {
        System.out.println(getClass().getSimpleName());
        runLikeACharm();
    }

    protected abstract void runLikeACharm();
}
