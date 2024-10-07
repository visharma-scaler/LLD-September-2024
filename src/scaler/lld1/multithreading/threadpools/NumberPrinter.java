package scaler.lld1.multithreading.threadpools;


public class NumberPrinter implements Runnable {

    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number is :" + number + " : " + Thread.currentThread().getName());
    }
}
