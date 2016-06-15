package net.println.day03.comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by benny on 6/15/16.
 */
public final class ExistsObject {
    int value;

    public ExistsObject(int value) {
        this.value = value;
    }

    public static class ExistsObjectComparator implements Comparator<ExistsObject>{

        @Override
        public int compare(ExistsObject o1, ExistsObject o2) {
            return o1.value - o2.value;
        }
    }

    @Override
    public String toString() {
        return "ExistsObject{" +
                "value=" + value +
                '}';
    }

    public static void main(String... args) {
        Set<ExistsObject> set = new TreeSet<>(new ExistsObjectComparator());
        set.add(new ExistsObject(0));
        set.add(new ExistsObject(-1));
        set.add(new ExistsObject(2));
        set.add(new ExistsObject(5));


        for (ExistsObject existsObject : set) {
            System.out.println(existsObject);
        }
    }
}
