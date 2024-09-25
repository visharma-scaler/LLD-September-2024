package scaler.lld1.constructors;

public class Student {
    private String name;
    String batchName;
    protected int age;
    public double psp;


//    private Student() {
//        name = "Vishal";
//    }


    public Student() {
        name = "Vishal";
    }


    public Student(String newStudentName, int newStudentAge) {
        name = newStudentName;
        age = newStudentAge;
    }


    private void changeBatch(String newBatchName) {
        batchName = newBatchName;
    }

    void giveMockInterviews() {
        System.out.println(name + " is giving Mock Interview!");
    }

}
