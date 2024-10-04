package scaler.lld1.multithreading.numberprinter;

public class Client {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int newPriority = (i % 5) + 1;
            NumberPrinter numberPrinter = new NumberPrinter(i, newPriority);
//        numberPrinter.run();


            Thread thread = new Thread(numberPrinter);
            thread.setPriority(newPriority);
            thread.start();
        }
    }
}
