package scaler.lld1.multithreading.addersubtractor;

public class Adder implements Runnable {

    private Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            counter.setValue(counter.getValue() + i);
        }
    }
}
