package scaler.lld1.introtolld;

public class Main {
    public static void main(String[] args) {
        // [DataType] [variable] = [Value];

        Student harsh = new Student();
        harsh.age = 24;
        harsh.psp = 80.50;
        harsh.name = "Harsh";
        harsh.batchName = "September 2024";

        Student vishal = new Student();
        vishal.age = 26;
        vishal.psp = 70.50;
        vishal.name = "Vishal";
        vishal.batchName = "NA";

        harsh.giveMockInterviews();

    }
}
