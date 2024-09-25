package scaler.lld1.accessModifiers;

public class Student {
    private String name;
    String batchName;
    protected int age;
    public double psp;

    private void changeBatch(String newBatchName) {
        batchName = newBatchName;
    }

    void giveMockInterviews() {
        System.out.println(name + " is giving Mock Interview!");
    }

}
