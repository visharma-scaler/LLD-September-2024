package scaler.lld1.lambdasandstreams.lambdas;

public class Client {
    public static void main(String[] args) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world from thread: " + Thread.currentThread().getName());
//            }
//        };

        // SAM Interfaces -> Single Abstract Method
        // Functional Interfaces

//        Runnable runnable = () -> System.out.println("Hello world from thread: " + Thread.currentThread().getName());
//        Thread thread = new Thread(runnable);
//        thread.start();
//

        new Thread(() -> System.out.println("Hello world from thread: " + Thread.currentThread().getName())).start();

    }
}
