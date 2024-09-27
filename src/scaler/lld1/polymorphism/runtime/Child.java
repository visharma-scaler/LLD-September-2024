package scaler.lld1.polymorphism.runtime;

public class Child extends Parent {

    public void doSomething() {
        System.out.println("Child is doing something");
        //'doSomething()' in 'scaler.lld1.polymorphism.runtime.Child' clashes
        // with 'doSomething()' in 'scaler.lld1.polymorphism.runtime.Parent';
    }
}
