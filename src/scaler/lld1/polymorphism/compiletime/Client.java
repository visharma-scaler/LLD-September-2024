package scaler.lld1.polymorphism.compiletime;

public class Client {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        greeting.greet();
        greeting.greet("Vishal");
        greeting.greet(20);
        greeting.greet("Sumit", 25);
        greeting.greet(26, "Bhavya");
        greeting.greet("Bhavya", 28, "bhavya");


    }
}
