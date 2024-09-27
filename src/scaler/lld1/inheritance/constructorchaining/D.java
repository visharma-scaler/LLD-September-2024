package scaler.lld1.inheritance.constructorchaining;

public class D extends C {
    D(int age) {
        super("Naman", age);
        System.out.println("Constructor of class D is called");
    }
}
