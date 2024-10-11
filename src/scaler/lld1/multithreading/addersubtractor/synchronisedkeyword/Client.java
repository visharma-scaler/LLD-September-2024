package scaler.lld1.multithreading.addersubtractor.synchronisedkeyword;


import java.util.concurrent.ExecutionException;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Counter counter = new Counter(0);

        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Counter value is:- " + counter.getValue());

//        String s = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//            return "Hello World";
//        }).get();
////                .thenAccept(System.out::println);
//
//        System.out.println(s);
//        System.out.println("Something else is done by main()");
//
//        Thread.sleep(5000);
//

    }
}
