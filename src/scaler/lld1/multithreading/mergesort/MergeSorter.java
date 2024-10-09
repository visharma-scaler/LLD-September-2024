package scaler.lld1.multithreading.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> array;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> array, ExecutorService executorService) {
        this.array = array;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        // 6, 4, 3, 8, 5, 2, 1, 10
        // 6, 4, 3, 8   // 5,2,1,10

        // 6, 4 // 3, 8   // 5,2  //1,10
        // 6 //4  ...

        if (array.size() <= 1) {
            return array;
        }

        int mid = array.size() / 2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftArray.add(array.get(i));
        }

        for (int i = mid; i < array.size(); i++) {
            rightArray.add(array.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();


//        List<Integer> leftSortedArray = leftMergeSorter.call();
//        List<Integer> rightSortedArray = rightMergeSorter.call();

        return merge(leftSortedArray, rightSortedArray);
    }

    private List<Integer> merge(List<Integer> leftSortedArray, List<Integer> rightSortedArray) {
        int i = 0, j = 0;
        List<Integer> mergedArray = new ArrayList<>();

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) <= rightSortedArray.get(j)) {
                mergedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                mergedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while (i < leftSortedArray.size()) {
            mergedArray.add(leftSortedArray.get(i));
            i++;
        }

        while (j < rightSortedArray.size()) {
            mergedArray.add(rightSortedArray.get(j));
            j++;
        }

        return mergedArray;
    }
}
