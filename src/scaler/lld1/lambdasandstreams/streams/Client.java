package scaler.lld1.lambdasandstreams.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        for (int i = 0; i < integers.size(); i++) {
//            //do something
//        }
//
//        for (Integer number : integers) {
//            //do something
//
//
//            // A lot of code for multithreaded environment?
//            List<Integer> squares = List.of(1, 4, 9);
//            for (Integer square: squares) {
//                //do something
//            }
//        }


//        integers.stream().forEach(System.out::println);

        Client client = new Client();
//        client.question1();
//        client.question2();
//        client.question4();
        client.question8();

    }


    // Iterate over it and print the square of each number.
    private void question1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        for (int i = 0; i < numbers.size(); i++) {
//            int square = numbers.get(i) * numbers.get(i);
//            System.out.println(square);
//        }

        numbers.stream()
                .map(this::square)
                .forEach(System.out::println);

    }

    //Find below a list of integers. Iterate over it and print every even number.
    private void question2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(this::isEven)
                .forEach(System.out::println);
    }

    // For a list of integers, return a list of the squares of each number.
    private void question4() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squares = numbers.stream()
                .map(this::square)
                .collect(Collectors.toList());

        System.out.println(squares);
    }

    // For a list of integers, find the sum of all the numbers.
    private void question8() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        int sum = 0;
//        for (Integer num : numbers) {
//            sum += num;
//        }
//
//        System.out.println(sum);


        // number <operation> <identity> = number;
        // 5 * 1 = 5
        // 5 + 0 = 5


        Integer sumValue = numbers.stream()
//                .reduce(0, (accumulator, currentNumber) -> accumulator + currentNumber);
                .reduce(0, Integer::sum);

        System.out.println(sumValue);
    }


    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    private int square(int num) {
//        System.out.println("Square function called out");
        return num * num;
    }
}


// Stream
// 1. Intermediary Operations -> map(), filter()
// 2. Terminal Operations -> forEach(), collect(), reduce()


