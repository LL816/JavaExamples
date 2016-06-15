package net.println.day03.hash;

import com.sun.tools.javac.util.Assert;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by benny on 6/15/16.
 */
public class Main {

    public static void main(String... args) {
        HashSet<Object> set = new HashSet<>();

        set.add(new NoHashCode("1", "benny"));
        WithHashCode withHashCode = new WithHashCode("1", "benny");
        set.add(withHashCode);
        FinalWithHashCode finalWithHashCode = new FinalWithHashCode("1", "benny");
        set.add(finalWithHashCode);

        Assert.check(!set.contains(new NoHashCode("1", "benny")));
        Assert.check(set.contains(new WithHashCode("1", "benny")));
        Assert.check(set.contains(new FinalWithHashCode("1", "benny")));

        HashMap<Object, Object> map = new HashMap<>();

        NoHashCode noHashCode = new NoHashCode("1", "benny");
        map.put(noHashCode , 0);
        map.put(new WithHashCode("1", "benny"), 1);
        map.put(new FinalWithHashCode("1", "benny"), 2);

        System.out.println(map.get(new NoHashCode("1", "benny")));
        System.out.println(map.get(new WithHashCode("1", "benny")));
        System.out.println(map.get(new FinalWithHashCode("1", "benny")));

        System.out.println(map.get(noHashCode));

    }

}
