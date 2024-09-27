package scaler.lld1.inheritance;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.username = "Vishal";
        user.password = "password";

        user.login();
//        user.schduleClass();


        Instructor instructor = new Instructor();
        instructor.username = "Sumit";
        instructor.password = "sumit123";

        instructor.login();
        instructor.scheduleClass();



    }
}
