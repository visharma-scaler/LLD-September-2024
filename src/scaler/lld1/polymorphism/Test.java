package scaler.lld1.polymorphism;

import scaler.lld1.inheritance.constructorchaining.A;

public class Test {
    protected static String HELLO = "Hello";
}

abstract class Test1 extends Test {
    protected static String HELLO1 = "Hello1";
}

class Test2 extends Test1 {

}


class Client123 {
    public static void main(String[] args) {
        String hello = Test.HELLO;
        String hello1 = Test1.HELLO1;
        String hello2 = Test1.HELLO;

//        Test1 test1 = new Test1();  //'Test1' is abstract; cannot be instantiated

        Test2 test2 = new Test2();

    }
}



interface ABC {
    void sayHello();
}

class ABCImpl implements ABC {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}

class XYZ extends ABCImpl implements ABC {
    @Override
    public void sayHello() {
        System.out.println("Hello from overrided method");
    }
}
