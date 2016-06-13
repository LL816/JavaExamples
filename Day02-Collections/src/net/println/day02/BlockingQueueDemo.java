package net.println.day02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by benny on 6/13/16.
 */
public class BlockingQueueDemo {
    public static void main(String... args) {
        final BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(20);

        new Thread("Producer"){
            @Override
            public void run() {
                super.run();
                int i = 0;
                while (true){
                    blockingQueue.offer(String.valueOf(++i));
                    log("Offer: " + i);
                    if(i == 100)break;
                }
            }
        }.start();

        new Thread("Consumer"){
            @Override
            public void run() {
                super.run();
                while(true) {
                    try {
                        String value = blockingQueue.take();
                        log("Take: " + value);
                        if (value.equals("100")) {
                            log("End.");
                            break;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }.start();

    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    public static void log(String log){
        System.out.format("[%s]<%s> %s\n", simpleDateFormat.format(new Date()), Thread.currentThread().getName(), log);
    }
}
