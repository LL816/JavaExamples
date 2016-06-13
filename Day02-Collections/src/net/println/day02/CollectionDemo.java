package net.println.day02;

import java.util.*;

/**
 * Created by benny on 6/13/16.
 */
public class CollectionDemo {
    public static void main(String... args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.addAll(Arrays.asList("world", "world", "This", "is", "demo."));
        collection.remove("world");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        for (String s : collection) {
            System.out.println(s);
        }

        System.out.println("-------b_b----我是调皮的分界线-------p-p---");
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("哈哈哈");
        linkedList.remove(0);
        linkedList.add("Middle");
        linkedList.addFirst("First");
        linkedList.addLast("Last");
        for (String s : linkedList) {
            System.out.println(s);
        }

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.offer(String.valueOf(i));
        }

        while(!queue.isEmpty()){
            System.out.println("Peek returns the first element of the queue, but not remove it.");
            System.out.println(queue.peek());

            System.out.println("Poll returns the first one and remove it from the queue.");
            System.out.println(queue.poll());
        }

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(String.valueOf(i));
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
