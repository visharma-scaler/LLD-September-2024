package scaler.lld1.multithreading.numberprinter;

public class NumberPrinter implements Runnable {

    private int number;
    private int priority;

    public NumberPrinter(int number, int newPriority) {
        this.number = number;
        this.priority = newPriority;
    }

    @Override
    public void run() {
        System.out.println("Number is :" + number + " : " + Thread.currentThread().getName() + " priority: " + priority);
        System.out.println("Demo Test is :" + number + " : " + Thread.currentThread().getName() + " priority: " + priority);

    }
}
