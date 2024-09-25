package scaler.lld1.accessModifiers;

public class LinkedList {
    private Node head;


    private static class Node {
        private int value;
        private Node next;
    }

    private void add(Node newNode){
        head.next = newNode;
    }
}
