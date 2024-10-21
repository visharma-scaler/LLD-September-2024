package scaler.lld1.collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(15);
        set.add(8);
        set.remove(10);
        set.add(22);
        set.add(10);

        System.out.println(set);


        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(10);
        stack.add(8);
        stack.add(9);

        stack.add(2, 100);

        System.out.println(stack);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(8);
        treeSet.add(9);

        System.out.println(treeSet);

    }
}
