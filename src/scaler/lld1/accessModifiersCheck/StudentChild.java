package scaler.lld1.accessModifiersCheck;

import scaler.lld1.accessModifiers.Student;

public class StudentChild extends Student {

    public void testAccessModifiers() {


        Student harsh = new Student();
//        harsh.age = 24;
        harsh.psp = 80.50;
//        harsh.name = "Harsh";
//        harsh.batchName = "September 2024";

        this.age = 24;
        this.psp = 80.50;
//        this.name = "Harsh";
//        this.batchName = "September 2024";

//        this.giveMockInterviews();
//        this.changeBatch("ABC");
    }
}
