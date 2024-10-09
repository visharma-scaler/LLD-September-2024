package scaler.lld1.multithreading.mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> data = List.of(6, 4, 3, 8, 5, 2, 1, 10, 1, 4, 2, 20, 6, 4, 3, 8, 5, 2, 1, 10, 1, 4, 2, 20);
        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(data, executorService);
        Future<List<Integer>> sortedDataFuture = executorService.submit(mergeSorter);

        List<Integer> sortedData = sortedDataFuture.get();// Blocking call -> Thread waits until the results are ready


        //        List<Integer> sortedDataFuture = mergeSorter.call();

        System.out.println("Sorted data is:- " + sortedData);

        executorService.shutdown();

    }
}
