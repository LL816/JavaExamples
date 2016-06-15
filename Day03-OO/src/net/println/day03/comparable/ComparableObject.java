package net.println.day03.comparable;

import java.util.*;

/**
 * Created by benny on 6/15/16.
 */
public class ComparableObject implements Comparable<ComparableObject> {

    int value;

    public ComparableObject(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(ComparableObject o) {
        return value - o.value;
    }

    @Override
    public String toString() {
        return "ComparableObject{" +
                "value=" + value +
                '}';
    }

    public static void main(String... args) {
        Set<ComparableObject> set = new TreeSet<>();
        set.add(new ComparableObject(0));
        set.add(new ComparableObject(3));
        set.add(new ComparableObject(2));
        set.add(new ComparableObject(2121));
        set.add(new ComparableObject(4));

        for (ComparableObject comparableObject : set) {
            System.out.println(comparableObject);
        }

        Map<ComparableObject, Object> map = new TreeMap<>();
        map.put((new ComparableObject(0)), 0);
        map.put((new ComparableObject(3)), 0);
        map.put((new ComparableObject(2)), 0);
        map.put((new ComparableObject(2121)), 0);
        map.put((new ComparableObject(4)), 0);

        for (Map.Entry<ComparableObject, Object> comparableObjectObjectEntry : map.entrySet()) {
            System.out.println(comparableObjectObjectEntry.getKey());
        }
    }
}
