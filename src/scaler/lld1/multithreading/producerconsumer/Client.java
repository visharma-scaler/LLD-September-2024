package scaler.lld1.multithreading.producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {
        Queue<Shirt> store = new ConcurrentLinkedQueue<>();

        Producer p1 = new Producer("P1", store, 6);
        Producer p2 = new Producer("P2", store, 6);
        Producer p3 = new Producer("P3", store, 6);

        Consumer c1 = new Consumer("C1", store);
        Consumer c2 = new Consumer("C2", store);
        Consumer c3 = new Consumer("C3", store);
        Consumer c4 = new Consumer("C4", store);
        Consumer c5 = new Consumer("C5", store);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(c1);
        Thread t5 = new Thread(c2);
        Thread t6 = new Thread(c3);
        Thread t7 = new Thread(c4);
        Thread t8 = new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
