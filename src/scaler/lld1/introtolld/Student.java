package scaler.lld1.introtolld;

public class Student {
    String name;
    String batchName;
    int age;
    double psp;

    void changeBatch(String newBatchName) {
        batchName = newBatchName;
    }

    void giveMockInterviews() {
        System.out.println(name + " is giving Mock Interview!");
    }

}
