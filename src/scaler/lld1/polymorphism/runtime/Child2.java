package scaler.lld1.polymorphism.runtime;

public class Child2 extends Parent {

    @Override
    public void doSomething() {
        System.out.println("Child2 is doing something");
    }

    public void sayHello() {
        System.out.println("Child2 is saying Hello");
    }
}
