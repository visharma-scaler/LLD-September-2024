package scaler.lld1.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 8, 9, 2);

        System.out.println("Before Sorting - " + numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting - " + numbers);


        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vishal", 27, 80));
        students.add(new Student(2, "Anuja", 25, 90));
        students.add(new Student(3, "Mohd Abulesh", 24, 100));
        students.add(new Student(4, "Upinta", 26, 70));


        System.out.println("----------------------------");
        System.out.println("Before Sorting");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);


        System.out.println();
        System.out.println("After Sorting");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------");

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Before Sorting using Comparator");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new StudentPspComparator());


        System.out.println();
        System.out.println("After Sorting using Comparator");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------");


        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Before Sorting using Comparator on names");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));


        System.out.println();
        System.out.println("After Sorting using Comparator on names");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------");


        Integer a = 7;
        Integer b = new Integer(7);

        System.out.println(a == b);
        System.out.println(a.equals(b));

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);

        for (int i = 0; i < (int) 1e9; i++) {
            list.add(10);
        }

    }
}
