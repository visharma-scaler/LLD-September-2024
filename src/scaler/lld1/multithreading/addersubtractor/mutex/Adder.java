package scaler.lld1.multithreading.addersubtractor.mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    private Counter counter;
    private Lock lock;

    public Adder(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            counter.setValue(counter.getValue() + i);
            lock.unlock();
        }
    }
}
