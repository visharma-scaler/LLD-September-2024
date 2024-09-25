package scaler.lld1.accessModifiers;

public class StudentChild extends Student {

    public void testAccessModifiers() {
        Student harsh = new Student();
        harsh.age = 24;
        harsh.psp = 80.50;
//        harsh.name = "Harsh";
        harsh.batchName = "September 2024";

        harsh.giveMockInterviews();
//        harsh.changeBatch("ABC");
    }
}
