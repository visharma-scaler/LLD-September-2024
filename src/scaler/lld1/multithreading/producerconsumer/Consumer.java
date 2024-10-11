package scaler.lld1.multithreading.producerconsumer;

import java.util.Queue;

public class Consumer implements Runnable {

    private String name;
    private Queue<Shirt> store;


    public Consumer(String name, Queue<Shirt> store) {
        this.name = name;
        this.store = store;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (!store.isEmpty()) {
                    System.out.println("Consumer " + name + " is consuming. Current store size is - " + store.size());
                    store.remove();
                }
            }
        }
    }
}
