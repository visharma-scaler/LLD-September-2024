package scaler.lld1.generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<Double, Double> coordinates = new Pair<>(3.67, 2.44);
//        Pair<double, double> coordinates1 = new Pair<>(3.63, 2.40);
//        //Type argument cannot be of primitive type

        Pair<String, String> message = new Pair<>("Vishal", "Hello World");
        Pair<Integer, String> student = new Pair<>(1, "Vishal");

//        Pair pair = new Pair("Vishal", 123);
//        Object first2 = pair.getFirst();
//        System.out.println(first2.length());

        String first = message.getFirst();
        System.out.println(first.length());

        Integer first1 = student.getFirst();
        System.out.println(first1 + 4);


        List list  = new ArrayList();   // -> java 1.2
        // Raw use of parameterized class 'List'


        List<Integer>  list1 = new ArrayList<>(); // java 1.5 or later

        // Backward compatibility

    }
}




//- Why Generics - https://docs.oracle.com/javase/tutorial/java/generics/why.html
//- Generic Types - https://docs.oracle.com/javase/tutorial/java/generics/types.html
//- Raw Types - https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html
//- Bounded Types - https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
//- Bounded Type Parameters - https://docs.oracle.com/javase/tutorial/java/generics/boundedTypeParams.html


// https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-questions.html