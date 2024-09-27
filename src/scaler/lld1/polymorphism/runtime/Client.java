package scaler.lld1.polymorphism.runtime;

public class Client {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.doSomething();

        Child child = new Child();
        child.doSomething();

        p = new Child();
        p.doSomething();


        p = new Child2();
        p.doSomething();
//        child2.sayHello();


        Child2 child_2 = new Child2();
        child_2.doSomething();
        child_2.sayHello();
    }
}
