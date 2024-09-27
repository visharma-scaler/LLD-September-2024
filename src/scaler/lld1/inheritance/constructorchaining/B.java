package scaler.lld1.inheritance.constructorchaining;

public class B extends A {
    int age;
    B(int newAge) {
        System.out.println("Constructor of class B is called");
        age = newAge;
        System.out.println("Age is - " + age);
    }
}
