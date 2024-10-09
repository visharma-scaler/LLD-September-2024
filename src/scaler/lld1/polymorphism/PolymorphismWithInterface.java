package scaler.lld1.polymorphism;

public class PolymorphismWithInterface {
    public static void main(String[] args) {
        Demo demo = new Demo1();
        demo.print();

    }
}

interface Demo {
    void print();
}

class Demo1 implements Demo {

    @Override
    public void print() {
        System.out.println("I am printing!");
    }
}
