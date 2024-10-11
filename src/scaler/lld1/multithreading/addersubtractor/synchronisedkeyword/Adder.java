package scaler.lld1.multithreading.addersubtractor.synchronisedkeyword;


import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    private Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
//            synchronized (counter) {
                counter.incrementValue(i);
//            }
        }
    }
}
