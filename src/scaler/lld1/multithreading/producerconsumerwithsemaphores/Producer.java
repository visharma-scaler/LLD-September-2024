package scaler.lld1.multithreading.producerconsumerwithsemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {

    private String name;
    private Queue<Shirt> store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(String name, Queue<Shirt> store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.name = name;
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Producer " + name + " is producing. Current store size is - " + store.size());
            store.add(new Shirt());

            consumerSemaphore.release();
        }
    }
}
