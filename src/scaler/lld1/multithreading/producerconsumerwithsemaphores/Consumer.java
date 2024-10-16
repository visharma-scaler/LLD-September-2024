package scaler.lld1.multithreading.producerconsumerwithsemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private String name;
    private Queue<Shirt> store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;


    public Consumer(String name, Queue<Shirt> store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.name = name;
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }


    @Override
    public void run() {
        while (true) {

            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }

            System.out.println("Consumer " + name + " is consuming. Current store size is - " + store.size());
            store.remove();

            producerSemaphore.release();

        }
    }
}
