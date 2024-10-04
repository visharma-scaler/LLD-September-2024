package scaler.lld1.multithreading.helloworld;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();


        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }
}
